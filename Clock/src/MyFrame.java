import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;

    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLable;

    JLabel dateLable;
    String time;
    String day;

    String date;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Clock Program");
        this.setLayout(new FlowLayout());
        this.setSize(400,250);
        this.setResizable(false);


        timeFormat=new SimpleDateFormat("hh:mm:ss a");
        dayFormat=new SimpleDateFormat("EEEE");
        dateFormat=new SimpleDateFormat("MMMMM dd, yyyy");

        timeLabel=new JLabel();
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
       timeLabel.setForeground(new Color(0x00FF00));
       timeLabel.setBackground(Color.black);
       timeLabel.setOpaque(true);

       dayLable=new JLabel();
       dayLable.setFont(new Font("Ink Free",Font.PLAIN,45));

       dateLable=new JLabel();
       dateLable.setFont(new Font("Ink Free",Font.PLAIN,35));

        this.add(timeLabel);
        this.add(dayLable);
        this.add(dateLable);
        this.setVisible(true);

        setTime();
    }
    public void setTime() {
        while(true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLable .setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLable .setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
