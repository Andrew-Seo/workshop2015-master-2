package Level_3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class santaList implements MouseListener
{
	ArrayList<JLabel> labels = new ArrayList();
	JFrame frame;
	JPanel panel;

	final int frameLength = 1000;
	final int frameWidth = 1000;

	public static void main(String[] args)
	{
		santaList s = new santaList();
	}

	santaList()
	{
		frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		panel = new JPanel();
		frame.add(panel);
		panel.setBackground(Color.BLACK);
		labels.add(this.loadImageFromTheInternet("http://resources3.news.com.au/images/2013/01/14/1226553/874707-piece-of-black-coal.jpg"));
		labels.add(this.loadImageFromTheInternet(
				"http://jscustom.theoldcomputer.com/images/manufacturers_systems/Nintendo/DS/876432NintendoDS.png"));
		labels.add(this.loadImageFromTheInternet("http://gematsu.com/wp-content/uploads/2016/06/Skyrim-Special-Ann-Init.jpg"));
		labels.add(this.loadImageFromTheInternet(
				"http://www.marshu.com/articles/images-website/articles/presidents-on-us-paper-money/one-hundred-100-dollar-bill.jpg"));
		labels.add(this
				.loadImageFromTheInternet("http://www.toysrus.com/graphics/tru_prod_images/Radio-Flyer-Boys-Fold-2--pTRU1-12786032dt.jpg"));
		mouseClicked(null);
		
		panel.addMouseListener(this);
		
		frame.setSize(frameLength, frameWidth);
		frame.pack();
	}

	private JLabel loadImageFromTheInternet(String imageUrl)
	{
		try
		{
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			return new JLabel(icon);
		} catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		return null;
	}

	private JLabel loadImageFromJavaProject(String fileName)
	{
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		// TODO Auto-generated method stub
		int Random = new java.util.Random().nextInt(5) + 1;
		JLabel something = labels.get(Random);
		panel.add(something);
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

}
