package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 클래스 자체가 JFrame이 되었음
// Swing 컴포넌트들은 상속을 통한 구현이 가능하다.
public class G05_JButton extends JFrame{
	
	public G05_JButton() {
		setLayout(null);

		// ContentPane : 프레임 내에서 실제로 내용이 그려지는곳
		getContentPane().setBackground(Color.black);
		
		JButton btn1 = new JButton("Button1");
		
		// 여러가지 버튼 설정들
		btn1.setText("Changed Text...");
		btn1.setBounds(100, 100, 300, 70);
		// 글씨색 설정
		btn1.setForeground(new Color(161, 198, 255));	// 색을 지정해 줄수도 있다.
		// 배경색 설정
		btn1.setBackground(Color.black);
		// btn1.setEnabled(false);
		
		// 버튼을 눌렀을 때의 동작을 설정
		btn1.addActionListener(new ActionListener() {
			// 즉석에서 상속받아 정의한다
			// ActionListener는 인터페이스이므로 상속받는 즉시 오버라이딩 해야한다.
			public void actionPerformed(ActionEvent e){
				getContentPane().setBackground(Color.orange);
			}
		});
		
		add(btn1);
		add(new MyButton(100, 200, this));		
		add(new MyButton(100, 300, this));
		
		
		setTitle("JButton Examples...");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(100, 100);
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new G05_JButton();
	}
}

class MyActrionListener implements ActionListener{
	
	JFrame parent;
	
	public MyActrionListener(JFrame parent) {
		this.parent = parent;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		parent.getContentPane().setBackground(Color.gray);
	}
}

class MyButton extends JButton implements ActionListener{
	
	JFrame parent;
	
	public MyButton(int x, int y, JFrame parent) {
		super("MyButton");
		
		this.parent = parent;
		
		setBounds(x, y, 300, 70);
		setForeground(new Color(161, 198, 255));
		setBackground(new Color(0, 0, 0));
		// 다른 클래스 만들어서 사용하는것
		//addActionListener(new MyActrionListener(parent));
		// 내부에 직접 만들어서 사용하는것
		addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		parent.getContentPane().setBackground(Color.green);
	}
}



