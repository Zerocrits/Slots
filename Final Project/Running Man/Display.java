import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.image.BufferedImage;

public class Display
{
	/*DECLARE VARIABLES*/
	private JFrame frame;
	private Canvas canvas;
	private String title;
	private int width, height;

	public Display(String title, int width, int height)
	{
		/*INITIALIZES VARIABLES FOR SIZE AND NAME OF GAME WINDOW*/
		this.title = title;
		this.width = width;
		this.height = height;

		/*CREATES CANVAS AND FRAME*/
		createDisplay();
	}

	private void createDisplay()
	{
		/*FRAME UNTILS*/
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		/*CANVAS UTILS*/
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		canvas.setFocusable(false);

		/*ADD AND PACK*/
		frame.add(canvas);
		frame.pack();
	}

	/*GETTERS*/
	public Canvas getCanvas()
	{
		return canvas;
	}

	public JFrame getFrame()
	{
		return frame;
	}
}