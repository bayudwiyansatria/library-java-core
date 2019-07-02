package com.bayudwiyansatria.mat;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.geom.Point2D.Double;
import javax.swing.JPanel;

class PlotPanel extends JPanel {
    private double[] x = new double[1];
    private double[] y = new double[1];
    private double xMin;
    private double xMax;
    private double yMin;
    private double yMax;
    private double[] dataX;
    private double[] dataY;
    int ny = 10;
    int nx = 10;
    boolean connected = false;
    private final int PAD = 40;
    private final boolean DEBUG = false;
    private boolean firstTime = true;
    private Graphics2D g2;
    private int w;
    private int h;
    private double xScale;
    private double yScale;
    private Double origin;
    private Double offset;
    private Paint[] colors = null;
    private int[] range = null;

    public PlotPanel(int axisxmin, int axisxmax, int axisymin, int axisymax) {
        this.xMin = (double)axisxmin;
        this.yMin = (double)axisymin;
        this.xMax = (double)axisxmax;
        this.yMax = (double)(-axisymax);
        this.x[0] = 0.0D;
        this.y[0] = this.yMax;
        this.repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.g2 = (Graphics2D)g;
        double x;
        if (this.firstTime) {
            this.g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            this.w = this.getWidth();
            this.h = this.getHeight();
            this.xScale = (double)(this.w - 80) / (this.xMax - this.xMin);
            this.yScale = (double)(this.h - 80) / (this.yMax - this.yMin);
            this.origin = new Double();
            this.offset = new Double();
            if (this.xMax < 0.0D) {
                this.origin.x = (double)(this.w - 40);
                this.offset.x = this.origin.x - this.xScale * this.xMax;
            } else if (this.xMin < 0.0D) {
                this.origin.x = 40.0D - this.xScale * this.xMin;
                this.offset.x = this.origin.x;
            } else {
                this.origin.x = 40.0D;
                this.offset.x = 40.0D - this.xScale * this.xMin;
            }

            if (this.yMax < 0.0D) {
                this.origin.y = (double)(this.h - 40);
                this.offset.y = this.origin.y - this.yScale * this.yMax;
            } else if (this.yMin < 0.0D) {
                this.origin.y = 40.0D - this.yScale * this.yMin;
                this.offset.y = this.origin.y;
            } else {
                this.origin.y = 40.0D;
                this.offset.y = 40.0D - this.yScale * this.yMin;
            }

            this.g2.draw(new java.awt.geom.Line2D.Double(40.0D, this.origin.y, (double)(this.w - 40), this.origin.y));
            this.g2.draw(new java.awt.geom.Line2D.Double(this.origin.x, 40.0D, this.origin.x, (double)(this.h - 40)));
            this.g2.setPaint(Color.black);
            Font font = this.g2.getFont();
            FontRenderContext frc = this.g2.getFontRenderContext();
            LineMetrics lm = font.getLineMetrics("0", frc);
            String s = String.valueOf((int)this.xMin);
            float width = (float)font.getStringBounds(s, frc).getWidth();
            x = this.offset.x + this.xScale * this.xMin;
            this.g2.drawString(s, (float)x, (float)this.origin.y + lm.getAscent());
            s = String.valueOf((int)this.xMax);
            width = (float)font.getStringBounds(s, frc).getWidth();
            x = this.offset.x + this.xScale * this.xMax;
            this.g2.drawString(s, (float)x - width, (float)this.origin.y + lm.getAscent());
            int d = (int)(this.xMax / (double)this.nx);

            for(int i = ~(0 - (int)(1L + (long)d)); (double)i < this.xMax; i += d) {
                s = String.valueOf(i);
                width = (float)font.getStringBounds(s, frc).getWidth();
                x = this.offset.x + this.xScale * (double)i;
                this.g2.drawString(s, (float)x - width, (float)this.origin.y + lm.getAscent());
            }

            s = String.valueOf((int)this.yMin);
            width = (float)font.getStringBounds(s, frc).getWidth();
            double var10000 = this.offset.y + this.yScale * this.yMin;
            s = String.valueOf((int)(-1.0D * this.yMax));
            width = (float)font.getStringBounds(s, frc).getWidth();
            double y = this.offset.y;
            this.g2.drawString(s, (float)this.origin.x - 28.0F, (float)y);
            d = (int)(-this.yMax / (double)this.ny);

            for(int i = ~(0 - (int)(1L + (long)d)); (double)i < -this.yMax; i += d) {
                s = String.valueOf(i);
                width = (float)font.getStringBounds(s, frc).getWidth();
                y = this.origin.y + this.yScale * (double)i;
                this.g2.drawString(s, (float)this.origin.x - 28.0F, (float)y);
            }
        }

        double prevx1 = this.origin.x;
        double prevy1 = this.origin.y;

        for(int i = 0; i < this.x.length; ++i) {
            x = this.offset.x + this.xScale * this.x[i];
            double y1 = this.offset.y + this.yScale * this.y[i];

            try {
                int j = 1;
                boolean ketemu = false;

                do {
                    if (i < this.range[j]) {
                        ketemu = true;
                    }

                    ++j;
                } while(!ketemu);

                this.g2.setPaint(this.colors[j - 2]);
            } catch (Exception var13) {
                this.g2.setPaint(Color.black);
            }

            this.g2.fill(new java.awt.geom.Ellipse2D.Double(x - 2.0D, y1 - 2.0D, 4.0D, 4.0D));
            if (this.connected) {
                this.g2.draw(new java.awt.geom.Line2D.Double(prevx1, prevy1, x, y1));
                prevx1 = x;
                prevy1 = y1;
            }
        }

    }

    public void setData(double[] x, double[] y, int[] r, Paint[] p) {
        this.range = r;
        this.colors = p;
        if (x.length != y.length) {
            throw new IllegalArgumentException("x and y data arrays must be same length.");
        } else {
            this.x = x;
            this.y = y;
            this.getExtremeValues(x);
            this.getExtremeValues(y);
            this.repaint();
        }
    }

    private double[] getExtremeValues(double[] d) {
        double min = 1.7976931348623157E308;
        double max = -min;

        for(int i = 0; i < d.length; ++i) {
            if (d[i] < min) {
                min = d[i];
            }

            if (d[i] > max) {
                max = d[i];
            }
        }

        return new double[]{min, max};
    }
}
