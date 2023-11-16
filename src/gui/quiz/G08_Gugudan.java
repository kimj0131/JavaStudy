package gui.quiz;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class G08_Gugudan extends JFrame{

	/*
		# 실행하면 구구단이 출력되는 GUI 프로그램을 만들어 보세요
		
		1. 프로그램을 처음 시작하면 구구단 2단이 출력된 상태로 시작
		
		2. + 버튼을 누르면 단이 증가하며 구구단 내용이 바뀜 (최대 9단 까지)
		
		3. - 버튼을 누르면 단이 감소하며 구구단 내용이 바뀜 (최소 2단 까지)
	*/
	static int dan = 2;
	
	public G08_Gugudan() {
		
		setTitle("Gugudan");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(500, 300);
		setSize(600, 200);
		setVisible(true);
		
		JButton plusButton = new JButton("단 +");
		JButton minusButton = new JButton("단 -");
		
		plusButton.setFont(new Font("굴림", Font.BOLD, 13));
		minusButton.setFont(new Font("굴림", Font.BOLD, 13));
		plusButton.setBounds(70, 10, 60, 35);
		minusButton.setBounds(10, 10, 60, 35);
		
		JLabel gugudan = new JLabel();

		gugudan.setText(getGugudan(dan));
		gugudan.setFont(new Font("굴림", Font.PLAIN, 15));
		gugudan.setLocation(10, 30);
		gugudan.setSize(1000, 100);
		
		plusButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(dan < 9) {
					dan++;
					System.out.println(dan + "단 출력");
					gugudan.setText(getGugudan(dan));
				} else {
					System.out.println("단수가 9초과입니다.");
				}
			}
		});
		
		minusButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (dan > 2) {
					dan--;
					System.out.println(dan + "단 출력");
					gugudan.setText(getGugudan(dan));
				} else {
					System.out.println("단수가 2미만입니다.");
				}
			}
		});
		
		add(plusButton);
		add(minusButton);
		add(gugudan);
	}
	
	public String getGugudan(int dan) {
		
		String gugudan = String.format("%d단 : ", dan);
		
		for(int i = 1; i <= 9; i++) {
			gugudan += String.format("%dx%d=%-2d ", dan, i, dan * i);
		}
		return gugudan;
	}
	
	public static void main(String[] args) {
		new G08_Gugudan();
		
	}
}
