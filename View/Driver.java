//public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MainFrame mainFrame = new MainFrame();
package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.function.Function2D;
import org.jfree.data.function.PolynomialFunction2D;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

		/*
		 * @see http://stackoverflow.com/a/20249795/230513
		 * @see http://stackoverflow.com/a/20107935/230513
		 * @see http://stackoverflow.com/q/20081801/230513
		 */
		public class Driver extends ApplicationFrame {

		    private Integer value = Integer.valueOf(-1);

		    public Driver(final String title) {
		        super(title);
		        final JFreeChart chart = ChartFactory.createXYLineChart(
		            "Parabola", "X", "Y", createDataset(value),
		            PlotOrientation.VERTICAL, true, true, false); 
//		        final JFreeChart chart = ChartFactory.createXYLineChart("Point", "X", "Y", createDataset(value));
		        final XYPlot plot = (XYPlot) chart.getPlot();
		        XYLineAndShapeRenderer r = (XYLineAndShapeRenderer) plot.getRenderer();
		        r.setBaseShapesVisible(true);
		        r.setSeriesShape(0, new Rectangle(-6, -6, 12, 12));
		        final ChartPanel chartPanel = new ChartPanel(chart) {

		            @Override
		            public Dimension getPreferredSize() {
		                return new Dimension(640, 480);
		            }
		        };
		        add(chartPanel, BorderLayout.CENTER);
		        JPanel p = new JPanel();
		        JSpinner s = new JSpinner();
		        s.setValue(value);
		        s.addChangeListener(new ChangeListener() {

		            @Override
		            public void stateChanged(ChangeEvent e) {
		                JSpinner s = (JSpinner) e.getSource();
		                int v = ((Number) s.getValue()).intValue();
		                plot.setDataset(createDataset(v));
		            }
		        });
		        p.add(new JLabel("a"));
		        p.add(s);
		        add(p, BorderLayout.SOUTH);
		    }

		    private XYDataset createDataset(int a) {
		        double[] array = {0.0, 0.0, a};
		        Function2D p = new PolynomialFunction2D(array);
		        return DatasetUtilities.sampleFunction2D(
		            p, -20.0, 20.0, 20, "y = " + a + "x� {-20�20}");
//		    	XYSeriesCollection xySeriesCollection = new XYSeriesCollection();
//		    	XYSeries series = new XYSeries("Point");
//		    	series.add(10, 20);
//		    	xySeriesCollection.addSeries(series);
//		    	return xySeriesCollection;
		    }

		    public static void main(final String[] args) {
		        EventQueue.invokeLater(new Runnable() {

		            @Override
		            public void run() {
		                final Driver demo = new Driver("Parabola Demo");
		                demo.pack();
		                RefineryUtilities.centerFrameOnScreen(demo);
		                demo.setVisible(true);
		            }
		        });
		    }
		}
	//}

//}
