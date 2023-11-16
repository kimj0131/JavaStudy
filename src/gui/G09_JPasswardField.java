package gui;

import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class G09_JPasswardField extends JFrame {
	// 비밀번호를 입력할 때 사용하는 필드
	
	public G09_JPasswardField() {
		super("JTextArea Sample");
		setLayout(new GridLayout(2, 2));
		
		JLabel idLabel = new JLabel("ID : ");
		JTextField idField = new JTextField();
		
		// 비밀번호를 텍스트 필드로 하게 되면 옆사람에게 다 보인다
		JLabel pwLabel = new JLabel("PW : ");
		JPasswordField pwField = new JPasswordField();
		// JTextField pwField = new JTextField();
		
		add(idLabel);
		add(idField);
		
		add(pwLabel);
		add(pwField);
		
		// 윈도우 사이즈가 변하는 이벤트
		// 컴포넌트의 적당한 크기를 정해보기 위한 이벤트
		this.addComponentListener(new ComponentAdapter() {
			// 창 위치를 변경하는 이벤트
			@Override
			public void componentMoved(ComponentEvent e) {
				System.out.println("x: " + e.getComponent().getX() + ", y : " + e.getComponent().getY());
			}
			
			// 창 크기를 변경하는 이벤트
			@Override
			public void componentResized(ComponentEvent e) {
				System.out.println("width : " + e.getComponent().getWidth() + ", height : " + e.getComponent().getHeight());
			}
			
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 80);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new G09_JPasswardField();
	}
}
