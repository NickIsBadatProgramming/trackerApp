import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Gui {
private String teamNameOutput;
private String teamNumberOutput;
private String autonomousPointsOutput;
private String climbingPointsOutput;
private String shootingPointsOutput;
private String winsOutput;
private String lossesOutput;
private String commentsOutput;
private boolean isRunning;

    public String getTeamNameOutput() {
        return teamNameOutput;
    }

    public String getTeamNumberOutput() {
        return teamNumberOutput;
    }

    public String getAutonomousPointsOutput() {
        return autonomousPointsOutput;
    }

    public String getClimbingPointsOutput() {
        return climbingPointsOutput;
    }

    public String getShootingPointsOutput() {
        return shootingPointsOutput;
    }

    public String getWinsOutput() {
        return winsOutput;
    }

    public String getLossesOutput() {
        return lossesOutput;
    }

    public String getCommentsOutput() {
        return commentsOutput;
    }
    public boolean getIsRunning() {
        return isRunning;
    }

    public void GUI() {

        Gui.this.isRunning = true;
        ///////////////////////// Frames \\\\\\\\\\\\\\\\\\\\\\\\\

        JFrame frame1 = new JFrame();
        JFrame frame2 = new JFrame();
        JFrame frame3 = new JFrame();



        ///////////////////////// Panels \\\\\\\\\\\\\\\\\\\\\\\\\

        // Panel 1
        JPanel panel1 = new JPanel();
        panel1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        panel1.setBackground(Color.darkGray);
        panel1.setForeground(Color.orange);

        // Panel 2
        JPanel panel2 = new JPanel();
        panel2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        panel2.setBackground(Color.darkGray);
        panel2.setForeground(Color.orange);
        // Panel 3
        JPanel panel3 = new JPanel();
        panel3.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        panel3.setBackground(Color.darkGray);
        panel3.setForeground(Color.orange);






        ///////////////////////// Screen Items \\\\\\\\\\\\\\\\\\\\\\\\\

        // Frame 1
        JLabel title1 = new JLabel();
        JTextField teamName = new JTextField();
        JTextField teamNumber = new JTextField();
        JButton nextButton1 = new JButton("Next Page");
        ImageIcon image = new ImageIcon("src/Mechanical Monarchy.png");
        JLabel logo = new JLabel(image);

        // Frame 2
        JLabel title2 = new JLabel();
        JTextField autonomousPoints = new JTextField();
        JTextField shootingPoints = new JTextField();
        JTextField climbingPoints = new JTextField();
        JButton lastButton1 = new JButton("Last Page");
        JButton nextButton2 = new JButton("Next Page");
        /* use this later */ JButton submitButton = new JButton("Submit Data");

        //Frame 3
        JLabel title3 = new JLabel();
        JTextField wins = new JTextField();
        JTextField losses = new JTextField();
        JTextField comments = new JTextField();
        JButton lastButton3 = new JButton("Last Page");



        // Additional Items
        Font titleFont = new Font("OCR A Extended", Font.BOLD, 64);
        Font headingFont = new Font("OCR A Extended", Font.PLAIN, 32);
        Font textFont = new Font("OCR A Extended", Font.PLAIN, 24);
        Color orange = new Color(241, 89, 33);



        ///////////////////////// Add Items \\\\\\\\\\\\\\\\\\\\\\\\\

        // Frame 1
        frame1.add(title1);
        frame1.add(teamName);
        frame1.add(teamNumber);
        frame1.add(nextButton1);
        frame1.add(logo);

        // Frame 2
        frame2.add(title2);
        frame2.add(autonomousPoints);
        frame2.add(shootingPoints);
        frame2.add(climbingPoints);
        frame2.add(lastButton1);
        frame2.add(nextButton2);

        //Frame 3
        frame3.add(title3);
        frame3.add(wins);
        frame3.add(losses);
        frame3.add(comments);
        frame3.add(lastButton3);
        frame3.add(submitButton);



        ///////////////////////// Configure Items Frame 1 \\\\\\\\\\\\\\\\\\\\\\\\\

        // Title 1 Configuration
        title1.setBounds(50, 0, 1180, 100);
        title1.setText("Team Details");
        title1.setForeground(orange);
        title1.setFont(titleFont);

        // Picture Configuration
        logo.setBounds(800, 100, 400, 400);

        // Team Name Configuration
        teamName.setBounds(50, 150, 500, 75);
        teamName.setBorder(BorderFactory.createTitledBorder((BorderFactory.createBevelBorder(0, Color.lightGray, Color.gray)), "Team Name", 1, 1, headingFont, orange));
        teamName.setBackground(Color.darkGray);
        teamName.setForeground(orange);
        teamName.setFont(textFont);

        // Team Number Configuration
        teamNumber.setBounds(50, 350, 500, 75);
        teamNumber.setBorder(BorderFactory.createTitledBorder((BorderFactory.createBevelBorder(0, Color.lightGray, Color.gray)), "Team Number", 1, 1, headingFont, orange));
        teamNumber.setBackground(Color.darkGray);
        teamNumber.setForeground(orange);
        teamNumber.setFont(textFont);



        ///////////////////////// Configure Items Frame 2 \\\\\\\\\\\\\\\\\\\\\\\\\

        // Title 2 Configuration
        title2.setBounds(50, 0, 1180, 100);
        title2.setText("Team Points");
        title2.setForeground(orange);
        title2.setFont(titleFont);

        // Autonomous Points Configuration
        autonomousPoints.setBounds(50, 150, 600, 75);
        autonomousPoints.setBorder(BorderFactory.createTitledBorder((BorderFactory.createBevelBorder(0, Color.lightGray, Color.gray)), "Points Scored in Autonomous", 1, 1, headingFont, orange));
        autonomousPoints.setBackground(Color.darkGray);
        autonomousPoints.setForeground(orange);
        autonomousPoints.setFont(textFont);

        // Shooting Points Configuration
        shootingPoints.setBounds(50, 275, 600, 75);
        shootingPoints.setBorder(BorderFactory.createTitledBorder((BorderFactory.createBevelBorder(0, Color.lightGray, Color.gray)), "Points Scored by Shooting", 1, 1, headingFont, orange));
        shootingPoints.setBackground(Color.darkGray);
        shootingPoints.setForeground(orange);
        shootingPoints.setFont(textFont);

        // Climbing Points Configuration
        climbingPoints.setBounds(50, 400, 600, 75);
        climbingPoints.setBorder(BorderFactory.createTitledBorder((BorderFactory.createBevelBorder(0, Color.lightGray, Color.gray)), "Points Scored by Climbing", 1, 1, headingFont, orange));
        climbingPoints.setBackground(Color.darkGray);
        climbingPoints.setForeground(orange);
        climbingPoints.setFont(textFont);

        /////////////////////////Configure Items Page 3\\\\\\\\\\\\\\\\\\\\\\\\\\
        title3.setBounds(50,0,1180,100);
        title3.setText("Wins and Losses");
        title3.setForeground(orange);
        title3.setFont(titleFont);

        // Wins Configuration
        wins.setBounds(50,150,600,75);
        wins.setBorder(BorderFactory.createTitledBorder((BorderFactory.createBevelBorder(0, Color.lightGray, Color.gray)), "Wins", 1, 1, headingFont, orange));
        wins.setBackground(Color.darkGray);
        wins.setForeground(orange);
        wins.setFont(textFont);

        // Losses configuration
        losses.setBounds(50, 275, 600, 75);
        losses.setBorder(BorderFactory.createTitledBorder((BorderFactory.createBevelBorder(0, Color.lightGray, Color.gray)), "Losses", 1, 1, headingFont, orange));
        losses.setBackground(Color.darkGray);
        losses.setForeground(orange);
        losses.setFont(textFont);

        //Comments config
        comments.setBounds(50, 400, 600, 75);
        comments.setBorder(BorderFactory.createTitledBorder((BorderFactory.createBevelBorder(0, Color.lightGray, Color.gray)), "Comments (Don't Use ',')", 1, 1, headingFont, orange));
        comments.setBackground(Color.darkGray);
        comments.setForeground(orange);
        comments.setFont(textFont);








        ///////////////////////// Page Buttons \\\\\\\\\\\\\\\\\\\\\\\\\

        // Next Page 1 Configuration
        nextButton1.setBounds(1000, 575, 200, 50);
        nextButton1.setFont(textFont);
        nextButton1.setBackground(orange);
        nextButton1.setBorder(BorderFactory.createTitledBorder((BorderFactory.createBevelBorder(0, Color.lightGray, Color.gray))));
        nextButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                frame1.setVisible(false);
                frame2.setVisible(true);
            }
        });

        // Last Page 1 Configuration
        lastButton1.setBounds(50, 575, 200, 50);
        lastButton1.setFont(textFont);
        lastButton1.setBackground(orange);
        lastButton1.setBorder(BorderFactory.createTitledBorder((BorderFactory.createBevelBorder(0, Color.lightGray, Color.gray))));
        lastButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                frame1.setVisible(true);
                frame2.setVisible(false);
            }
        });

        //Next Page 2 Configuration
        nextButton2.setBounds(1000,575,200,50);
        nextButton2.setFont(textFont);
        nextButton2.setBackground(orange);
        nextButton2.setBorder(BorderFactory.createTitledBorder((BorderFactory.createBevelBorder(0,Color.lightGray,Color.gray))));
        nextButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                frame2.setVisible(false);
                frame3.setVisible(true);
            }
        });

        //Last Page 3 Configuration
        lastButton3.setBounds(50, 575, 200, 50);
        lastButton3.setFont(textFont);
        lastButton3.setBackground(orange);
        lastButton3.setBorder(BorderFactory.createTitledBorder((BorderFactory.createBevelBorder(0, Color.lightGray, Color.gray))));
        lastButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                frame2.setVisible(true);
                frame3.setVisible(false);
            }
        });




        // Submit Button Configuration
        submitButton.setBounds(1000, 575, 200, 50);
        submitButton.setFont(textFont);
        submitButton.setBackground(orange);
        submitButton.setBorder(BorderFactory.createTitledBorder((BorderFactory.createBevelBorder(0, Color.lightGray, Color.gray))));
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {

                String teamNameOutput = teamName.getText();
                String teamNumberOutput = teamNumber.getText();
                String autonomousPointsOutput = autonomousPoints.getText();
                String shootingPointsOutput = shootingPoints.getText();
                String climbingPointsOutput = climbingPoints.getText();
                String winsOutput = wins.getText();
                String lossesOutput = losses.getText();
                String commentsOutput = comments.getText();

                Gui.this.teamNameOutput = teamNameOutput;
                Gui.this.teamNumberOutput = teamNumberOutput;
                Gui.this.autonomousPointsOutput = autonomousPointsOutput;
                Gui.this.shootingPointsOutput = shootingPointsOutput;
                Gui.this.climbingPointsOutput = climbingPointsOutput;
                Gui.this.winsOutput = winsOutput;
                Gui.this.lossesOutput = lossesOutput;
                Gui.this.commentsOutput = commentsOutput;
                Gui.this.isRunning = false;


                frame3.setVisible(false);
            }
        });



        ///////////////////////// Frame Parameters \\\\\\\\\\\\\\\\\\\\\\\\\

        // Frame 1
        frame1.add(panel1, BorderLayout.CENTER);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setPreferredSize(new Dimension(1280, 720));
        frame1.setTitle("Robotics Program - Page 1");
        frame1.pack();
        frame1.setVisible(true);

        // Frame 2
        frame2.add(panel2, BorderLayout.CENTER);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setPreferredSize(new Dimension(1280, 720));
        frame2.setTitle("Robotics Program - Page 2");
        frame2.pack();
        frame2.setVisible(false);

        //Frame 3
        frame3.add(panel3, BorderLayout.CENTER);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setPreferredSize(new Dimension(1280,720));
        frame3.setTitle("Robotics Program - Page 3");
        frame3.pack();
        frame3.setVisible(false);

    }
}