package HomePage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Home extends JFrame implements ActionListener{
	private JPanel jp=new JPanel(); //创建JPanel对象
	private JLabel[] jlArray= {new JLabel("用户名"),new JLabel("密 码"),new JLabel("")}; //创建标签数组
	private JButton jb= new JButton("登录"); //创建按钮
	private JTextField jtxtName=new JTextField(); //创建文本框
	private JPasswordField jtxtPassword=new JPasswordField(); //创建密码框
	public Home() {
		jp.setLayout(null); //设置绝对布局
		for(int i=0;i<2;i++) {
			jlArray[i].setBounds(30,20+i*50,80,26); //设置标签大小
			jb.setBounds(160,130,80,26); //设置按钮大小
			jp.add(jlArray[i]); //将标签添加到容器中
			jp.add(jb); //将按钮添加到容器中
			jb.addActionListener(this); //添加监听器
		}
		jtxtName.setBounds(80,20,180,30); //设置文本框大小
		jp.add(jtxtName); //将文本框添加到容器
		jtxtName.addActionListener(this); //添加监听器
		jtxtPassword.setBounds(80,70,180,30); //设置密码框大小
		jp.add(jtxtPassword); //将密码框添加到容器
		jtxtPassword.addActionListener(this); //添加监视器
		jlArray[2].setBounds(10,180,300,30); //设置标签大小
		jp.add(jlArray[2]); //将标签参数添加到容器
		this.add(jp); //将容器添加到窗体
		this.setTitle("易停，专注高效的智能停车管理系统");
		this.setResizable(false);
		this.setBounds(100,100,300,500);
		this.setVisible(true);
	}
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==jtxtName) {
				jtxtPassword.requestFocus();
			}else {
				if(jtxtName.getText().equals("silence")&&String.valueOf(jtxtPassword.getPassword()).equals("123456")) {
					jlArray[2].setText("登录成功！");
				}else {
					jlArray[2].setText("用户名或密码错误");
				}
			}
	}
	
	public static void main(String[] args) {
		new Home();
	}
}




