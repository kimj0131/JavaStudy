package gui;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class G11_Image {
	
	// 해당 컴포넌트의 이미지를 setIcon 메서드로 교체할 수 있다.
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Image Samples");
		
		f.setLayout(new BorderLayout());
		
		JLabel imageLabel = new JLabel();
		
		// 라벨에 이미지 설정하기
		// imageLabel.setIcon(new ImageIcon("myfiles/images/fruits/images1.jpg"));
		
		// 이미지 크기 수정해서 사용하기
		try {
			// 1. 이미지 크기를 수정하기위해 불러온다.
			BufferedImage bufferedImage = ImageIO.read(new File("myfiles/images/fruits/images1.jpg"));
			
			// 2. 불러온 이미지로부터 사이즈 조절된 새로운 인스턴스를 받을 수 있다.
			Image scaledImage =
				bufferedImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
			
			// 2-1. 이미지 일부를 잘라서 활용하는 방법도 있다.
			// Image subImage = bufferedImage.getSubimage(50, 50, 150, 100);
			
			
			
			// 3. 크기 조절된 이미지를 라벨에 붙인다.
			imageLabel.setIcon(new ImageIcon(scaledImage));
			// imageLabel.setIcon(new ImageIcon(subImage));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 연습 : 다음 버튼을 누르면 이미지가 교체되도록 만들어보세요 (순환 될것)
		JButton southBtn = new JButton("다음!");
		
		List<ImageIcon> images = new ArrayList<>();
		int imageQty = 3;
		for (int i = 1; i <= imageQty; i++) {
			images.add(new ImageIcon("myfiles/images/fruits/images" + i + ".jpg"));
		}
		
		imageLabel.setIcon(images.get(0));
		southBtn.addActionListener(new ActionListener() {
			int index = 1;
			@Override
			public void actionPerformed(ActionEvent e) {
				if(index < images.size()) {
					imageLabel.setIcon(images.get(index++));
				} else if (index == images.size() || index > images.size()){
					imageLabel.setIcon(images.get(index = 0));
					index++;
				}
			}
		});
		f.add(imageLabel, "Center");
		f.add(southBtn, "South");
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
				
	}
}
