import sys
import cv2
from PyQt5.QtWidgets import QApplication, QMainWindow, QLabel, QPushButton, QVBoxLayout, QHBoxLayout, QWidget, QSlider
from PyQt5.QtCore import Qt, QTimer
from PyQt5.QtGui import QImage, QPixmap

class VideoPlayer(QMainWindow):
    def __init__(self, video_path):
        super().__init__()

        self.setWindowTitle("OpenCV Video Player with PyQt Playbar")
        self.setGeometry(100, 100, 900, 600)

        # OpenCV setup
        self.cap = cv2.VideoCapture(video_path)
        if not self.cap.isOpened():
            print("Error loading video file.")
            sys.exit(0)

        self.total_frames = int(self.cap.get(cv2.CAP_PROP_FRAME_COUNT))
        self.fps = int(self.cap.get(cv2.CAP_PROP_FPS)) or 30
        self.frame_pos = 0
        self.playing = False

        # Timer to update frames
        self.timer = QTimer()
        self.timer.timeout.connect(self.next_frame)

        # UI Elements
        self.video_label = QLabel(self)
        self.video_label.setAlignment(Qt.AlignCenter)

        self.slider = QSlider(Qt.Horizontal)
        self.slider.setRange(0, self.total_frames - 1)
        self.slider.sliderMoved.connect(self.seek_frame)

        self.play_btn = QPushButton("Play")
        self.play_btn.clicked.connect(self.toggle_play)

        # Layouts
        control_layout = QHBoxLayout()
        control_layout.addWidget(self.play_btn)
        control_layout.addWidget(self.slider)

        layout = QVBoxLayout()
        layout.addWidget(self.video_label)
        layout.addLayout(control_layout)

        container = QWidget()
        container.setLayout(layout)
        self.setCentralWidget(container)

        # Load the first frame (instead of load_frame, use next_frame)
        self.next_frame()


    def toggle_play(self):
        if self.playing:
            self.timer.stop()
            self.play_btn.setText("Play")
        else:
            self.timer.start(1000 // self.fps)
            self.play_btn.setText("Pause")
        self.playing = not self.playing

    def next_frame(self):
        ret, frame = self.cap.read()
        if not ret:
            self.timer.stop()
            self.playing = False
            self.play_btn.setText("Play")
            return

        self.frame_pos += 1
        self.slider.setValue(self.frame_pos)
        self.display_frame(frame)

    def seek_frame(self, position):
        self.cap.set(cv2.CAP_PROP_POS_FRAMES, position)
        self.frame_pos = position
        ret, frame = self.cap.read()
        if ret:
            self.display_frame(frame)

    def display_frame(self, frame):
        frame_rgb = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)
        h, w, ch = frame_rgb.shape
        bytes_per_line = ch * w
        qimg = QImage(frame_rgb.data, w, h, bytes_per_line, QImage.Format_RGB888)
        self.video_label.setPixmap(QPixmap.fromImage(qimg))

    def closeEvent(self, event):
        self.cap.release()
        event.accept()


if __name__ == '__main__':
    app = QApplication(sys.argv)
    player = VideoPlayer("C:/Users/leste/Downloads/ex file python/assests/Mars4k.mp4")  # Use your actual path
    player.show()
    sys.exit(app.exec_())
