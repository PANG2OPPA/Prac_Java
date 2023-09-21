import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.awt.Desktop;
import java.util.Random;

public class xx {
    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            JFrame frame = new JFrame("Display Image Example");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//            ImageIcon imageIcon = new ImageIcon("D:\\포카리스웨트.jpg"); // 이미지 파일의 경로를 지정해야 합니다.
//            JLabel label = new JLabel(imageIcon);
//
//            frame.getContentPane().add(label);
//            frame.pack();
//            frame.setVisible(true);
//        });
//    }
//
        String[] youtubeLinks = {
                "https://www.youtube.com/watch?v=RGLrL2M5MOs",
                "https://www.youtube.com/watch?v=MHokxaunuJY",
                "https://www.youtube.com/watch?v=9V2tVurYTxc",
                "https://www.youtube.com/watch?v=vloMDezTHWc",
                "https://www.youtube.com/watch?v=okVTSehE414"
        };

        Random random = new Random();
        int randomIndex = random.nextInt(youtubeLinks.length);
        System.out.println(randomIndex);
        String selectedLink = youtubeLinks[randomIndex];

        try {
            Desktop.getDesktop().browse(new URI(selectedLink));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
