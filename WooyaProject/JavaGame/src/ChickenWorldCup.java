import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChickenWorldCup {
	public static final String[] images = null;
	static JPanel panelNorth;
	static JPanel panelCenter;
	static JLabel labelMessage;
	static JLabel labelVs;
	static JButton buttonLeft;
	static JButton buttonRight;
	static String[] imges = {
	   "BHC 맛초킹", "BHC 뿌링클", "BHC 핫후라이드", "교촌 레드콤보", "교촌 허니콤보",
	   "굽네 고추바사삭", "굽네 오리지널", "네네 스노윙", "네네 오리엔탈파닭", "멕시칸 닭강정",
	   "비비큐 자메이카통다리", "비비큐 황금올리브", "지코바 숯불양념치킨", "처갓집 슈프림치킨",
	   "페리카나 양념치킨", "푸라닭 블랙알리오"
     };
   
	static int imageIndex = 2; //3th image index initialized
	
	//function : image to put on Button Control
	static ImageIcon changeImage(String filename) {
		ImageIcon icon = ImageIcon("./"+filename);
		Image originImage = icon.getImage();
		Image changedImage = originImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon icon_new = new ImageIcon(changedImage);
	}
	
	
	private static ImageIcon ImageIcon(String string) {
		// TODO Auto-generated method stub
		return null;
	}


	public static void main(String[] args) {
		
		class MyFrame extends JFrame implements ActionListener {
			public MyFrame(String title) {
				super( title );
				
				//UI Init
				this.setSize(450, 250);
				this.setVisible(true);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				panelNorth = new JPanel();
				labelMessage = new JLabel("Find Your Chicken!");
				labelMessage.setFont(new Font("Arial", Font.BOLD, 20));
				panelNorth.add(labelMessage);
				this.add( "North", panelNorth );
				
				panelCenter = new JPanel();
				labelVs = new JLabel("vs");
				labelVs.setFont( new Font("Arial", Font.BOLD, 20));
				buttonLeft = new JButton("LeftButton");
				buttonLeft.setIcon(changeImage("BHC 맛초킹.jpg"));
				buttonLeft.setPreferredSize(new Dimension(200,200));
				
				buttonRight = new JButton("RightButton");
				buttonRight.setIcon(changeImage("BHC 뿌링클.jpg"));
				buttonRight.setPreferredSize(new Dimension(200,200));
				//add click event
				buttonLeft.addActionListener(this);
				buttonRight.addActionListener(this);
				
				panelCenter.add(buttonLeft);
				panelCenter.add(buttonRight);
				panelCenter.add(labelVs);
				this.add( "Center", panelCenter );
				
				//clear empty space -> pack
				this.pack();
				}
			
			
            
			//Button Click Event Callback
			@Override
			public void actionPerformed(ActionEvent e) {
				if( imageIndex == 16) {
					//Last Chicken.
					labelMessage.setText("Found Your Idol!");
					//Show One Image
					if(e.getActionCommand().equals("LeftButton")) {
				        buttonRight.hide();
				        labelVs.hide();
					
					
				}else {
				    buttonLeft.hide();
				    labelVs.hide();
				
			}
				if(e.getActionCommand().equals("LeftButton")); {
					//LeftButton Clicked.
					buttonRight.setIcon(changeImage(images[imageIndex]));
					imageIndex++;
			}else {
				    //RightButton Clicked.
				    buttonLeft.setIcon(changeImage(images[imageIndex]));
				    imageIndex++;
				
				
			}
				
			}
		}
		
		new MyFrame("Chiken Wolrd Cup"); {
	

	}

  }
}
