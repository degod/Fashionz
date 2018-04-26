package com.fashion;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;


public class FashionDesign extends JFrame {
    
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    public FashionDesign(){
        initComponent();
        dbConnect();
        CreateDB();
    }
    
    public void dbConnect(){
        try {          
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:Fashiondb");
            stmt = con.createStatement();

            if (con != null) {
                System.out.println("Connection to SQLite has been established.");
            }else{
                System.out.println("Not Connected");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    
    
    public void CreateDB() {
        try {
            String sql = "Create table IF NOT EXISTS CustomerTable("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "Name varchar not null,"
                    + "Address varchar not null,"
                    + "Telephone varchar not null,"
                    + "Email varchar not null,"
                    + "DateofBirth varchar not null,"
                    + "Height varchar not null,"
                    + "Neck varchar not null,"
                    + "Chest varchar not null,"
                    + "Bust varchar not null,"
                    + "Waist varchar not null,"
                    + "Highwaist varchar not null,"
                    + "Hip varchar not null,"
                    + "BustHeight varchar not null,"
                    + "BreastDistance varchar not null,"
                    + "Shoulder varchar not null,"
                    + "Shoulderunderbust varchar not null,"
                    + "Frontwaist varchar not null,"
                    + "Backwaist varchar not null,"
                    + "Backwidth varchar not null,"
                    + "Backshoulder varchar not null,"
                    + "Arm varchar not null,"
                    + "Elbow varchar not null,"
                    + "Wrist varchar not null,"
                    + "Blouselength varchar not null,"
                    + "Elbowlength varchar not null,"
                    + "Sleevelength varchar not null,"
                    + "Dresslength varchar not null,"
                    + "Dress_length varchar not null,"
                    + "Skirtlength varchar not null,"
                    + "Skirt_length varchar not null,"
                    + "Kneelength varchar not null,"
                    + "Trouserlength varchar not null,"
                    + "Crotchlength varchar not null,"
                    + "Kneecircum varchar not null,"
                    + "Thighcircum varchar not null,"
                    + "Anklecircum varchar not null"
                    + ")";
                    
                      
                    stmt.executeUpdate(sql);
            
            
        }catch (Exception e) {
            System.err.println(e.getMessage());
             e.printStackTrace();   
        }
    }
    
        
    public void initComponent(){
        JFrame j = new JFrame();
        j.setTitle("AMANJIDE");
        j.setIconImage(new ImageIcon(getClass().getResource("night.png")).getImage());
        j.setSize(800,850);
        j.setResizable(false);
        j.setLocationRelativeTo(null);
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        //Setting the Panels
        JPanel MainPanel = new JPanel();
        MainPanel.setSize(800,850);
        
        JPanel jp = new JPanel();
        jp.setSize(800,850);
        jp.setBackground(Color.WHITE);
        
        JPanel jps = new JPanel();
        jps.setSize(800,850);
        jps.setBackground(Color.WHITE);
        
        JPanel header = new JPanel();
        header.setSize(800,50);
        header.setBackground(Color.BLACK);
        
        //Setting the Layouts
        MainPanel.setLayout(new CardLayout());
        jp.setLayout(new AbsoluteLayout());
        jps.setLayout(new AbsoluteLayout());
        header.setLayout(new AbsoluteLayout());
        
        //Setting the Labels
        JLabel title = new JLabel();
        title.setText("CUSTOMER DETAILS");
        title.setForeground(Color.white);
        title.setFont(new Font("Consolas", 0, 30));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel search = new JLabel();
        search.setText("Search Using Name: ");
        search.setForeground(Color.black);
        search.setFont(new Font("Consolas", 0, 15));
        
        JLabel details = new JLabel();
        details.setText("MEASUREMENT DETAILS");
        details.setForeground(Color.black);
        details.setFont(new Font("Tahoma", 0,22));
        details.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel jdetails = new JLabel();
        jdetails.setText("MEASUREMENT DETAILS");
        jdetails.setForeground(Color.black);
        jdetails.setFont(new Font("Tahoma", 0,22));
        jdetails.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel Tdetails = new JLabel();
        Tdetails.setText("TROUSER MEASUREMENT");
        Tdetails.setForeground(Color.black);
        Tdetails.setFont(new Font("Tahoma", 0,22));
        Tdetails.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel jTdetails = new JLabel();
        jTdetails.setText("TROUSER MEASUREMENT");
        jTdetails.setForeground(Color.black);
        jTdetails.setFont(new Font("Tahoma", 0,22));
        jTdetails.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel name = new JLabel();
        name.setText("Name: ");
        name.setForeground(Color.BLACK);
        name.setFont(new Font("Consolas", 0, 14));
        
        JLabel address = new JLabel();
        address.setText("Address: ");
        address.setForeground(Color.BLACK);
        address.setFont(new Font("Consolas", 0, 14));
        
        JLabel telephone = new JLabel();
        telephone.setText("Telephone: ");
        telephone.setForeground(Color.BLACK);
        telephone.setFont(new Font("Consolas", 0, 14));
        
        JLabel email = new JLabel();
        email.setText("Email: ");
        email.setForeground(Color.BLACK);
        email.setFont(new Font("Consolas", 0, 14));
        
        JLabel dob = new JLabel();
        dob.setText("Date Of Birth: ");
        dob.setForeground(Color.BLACK);
        dob.setFont(new Font("Consolas", 0, 14));
        
        JLabel height = new JLabel();
        height.setText("Height: ");
        height.setForeground(Color.BLACK);
        height.setFont(new Font("Consolas", 0, 14));
        
        JLabel neck = new JLabel();
        neck.setText("Neck: ");
        neck.setForeground(Color.BLACK);
        neck.setFont(new Font("Consolas", 0, 14));
        
        JLabel chest = new JLabel();
        chest.setText("Chest: ");
        chest.setForeground(Color.BLACK);
        chest.setFont(new Font("Consolas", 0, 14));
        
        JLabel bust = new JLabel();
        bust.setText("Bust: ");
        bust.setForeground(Color.BLACK);
        bust.setFont(new Font("Consolas", 0, 14));
        
        JLabel waist = new JLabel();
        waist.setText("Waist: ");
        waist.setForeground(Color.BLACK);
        waist.setFont(new Font("Consolas", 0, 14));
        
        JLabel hip = new JLabel();
        hip.setText("Hip: ");
        hip.setForeground(Color.BLACK);
        hip.setFont(new Font("Consolas", 0, 14));
        
        JLabel bHeight = new JLabel();
        bHeight.setText("Bust Height: ");
        bHeight.setForeground(Color.BLACK);
        bHeight.setFont(new Font("Consolas", 0, 14));
        
        JLabel Highwaist = new JLabel();
        Highwaist.setText("High Waist: ");
        Highwaist.setForeground(Color.BLACK);
        Highwaist.setFont(new Font("Consolas", 0, 14));
        
        JLabel bDistance = new JLabel();
        bDistance.setText("Breast Distance: ");
        bDistance.setForeground(Color.BLACK);
        bDistance.setFont(new Font("Consolas", 0, 14));
        
        JLabel Shoulder = new JLabel();
        Shoulder.setText("Shoulder: ");
        Shoulder.setForeground(Color.BLACK);
        Shoulder.setFont(new Font("Consolas", 0, 14));
        
        JLabel stUnderbust = new JLabel();
        stUnderbust.setText("Shoulder To Underbust: ");
        stUnderbust.setForeground(Color.BLACK);
        stUnderbust.setFont(new Font("Consolas", 0, 14));
        
        JLabel fwLength = new JLabel();
        fwLength.setText("Front Waist Length: ");
        fwLength.setForeground(Color.BLACK);
        fwLength.setFont(new Font("Consolas", 0, 14));
        
        JLabel bwLength = new JLabel();
        bwLength.setText("Back Waist Length: ");
        bwLength.setForeground(Color.BLACK);
        bwLength.setFont(new Font("Consolas", 0, 14));
        
        JLabel bWidth = new JLabel();
        bWidth.setText("Back Width: ");
        bWidth.setForeground(Color.BLACK);
        bWidth.setFont(new Font("Consolas", 0, 14));
        
        JLabel bsWidth = new JLabel();
        bsWidth.setText("Back Shoulder Width: ");
        bsWidth.setForeground(Color.BLACK);
        bsWidth.setFont(new Font("Consolas", 0, 14));
        
        JLabel arm = new JLabel();
        arm.setText("Arm: ");
        arm.setForeground(Color.BLACK);
        arm.setFont(new Font("Consolas", 0, 14));
        
        JLabel elbow = new JLabel();
        elbow.setText("Elbow: ");
        elbow.setForeground(Color.BLACK);
        elbow.setFont(new Font("Consolas", 0, 14));
        
        JLabel wrist = new JLabel();
        wrist.setText("Wrist: ");
        wrist.setForeground(Color.BLACK);
        wrist.setFont(new Font("Consolas", 0, 14));
        
        JLabel blouseLength = new JLabel();
        blouseLength.setText("Blouse Length: ");
        blouseLength.setForeground(Color.BLACK);
        blouseLength.setFont(new Font("Consolas", 0, 14));
        
        JLabel Elength = new JLabel();
        Elength.setText("Elbow Length: ");
        Elength.setForeground(Color.BLACK);
        Elength.setFont(new Font("Consolas", 0, 14));
        
        JLabel Sleevelength = new JLabel();
        Sleevelength.setText("Sleeve Length: ");
        Sleevelength.setForeground(Color.BLACK);
        Sleevelength.setFont(new Font("Consolas", 0, 14));
        
        JLabel Dlength = new JLabel();
        Dlength.setText("Dress Length(until knee): ");
        Dlength.setForeground(Color.BLACK);
        Dlength.setFont(new Font("Consolas", 0, 14));
        
        JLabel Dlength1 = new JLabel();
        Dlength1.setText("Dress Length(until floor): ");
        Dlength1.setForeground(Color.BLACK);
        Dlength1.setFont(new Font("Consolas", 0, 14));
        
        JLabel Slength = new JLabel();
        Slength.setText("Skirt Length(until knee): ");
        Slength.setForeground(Color.BLACK);
        Slength.setFont(new Font("Consolas", 0, 14));
        
        JLabel Slength1 = new JLabel();
        Slength1.setText("Skirt Length(until floor): ");
        Slength1.setForeground(Color.BLACK);
        Slength1.setFont(new Font("Consolas", 0, 14));
        
        JLabel kneeLength = new JLabel();
        kneeLength.setText("Knee Length: ");
        kneeLength.setForeground(Color.BLACK);
        kneeLength.setFont(new Font("Consolas", 0, 14));
        
        JLabel tLength = new JLabel();
        tLength.setText("Trouser Length: ");
        tLength.setForeground(Color.BLACK);
        tLength.setFont(new Font("Consolas", 0, 14));
        
        JLabel crotchLength = new JLabel();
        crotchLength.setText("Crotch Length: ");
        crotchLength.setForeground(Color.BLACK);
        crotchLength.setFont(new Font("Consolas", 0, 14));
        
        JLabel kCircumference = new JLabel();
        kCircumference.setText("Knee Circumference: ");
        kCircumference.setForeground(Color.BLACK);
        kCircumference.setFont(new Font("Consolas", 0, 14));
        
        JLabel tCircumference = new JLabel();
        tCircumference.setText("Thigh Circumference: ");
        tCircumference.setForeground(Color.BLACK);
        tCircumference.setFont(new Font("Consolas", 0, 14));
        
        JLabel aCircumference = new JLabel();
        aCircumference.setText("Ankle Circumference: ");
        aCircumference.setForeground(Color.BLACK);
        aCircumference.setFont(new Font("Consolas", 0, 14));
        
        //Setting Next Panel Label
        JLabel jname = new JLabel();
        jname.setText("Name: ");
        jname.setForeground(Color.BLACK);
        jname.setFont(new Font("Consolas", 0, 14));
        
        JLabel jaddress = new JLabel();
        jaddress.setText("Address: ");
        jaddress.setForeground(Color.BLACK);
        jaddress.setFont(new Font("Consolas", 0, 14));
        
        JLabel jtelephone = new JLabel();
        jtelephone.setText("Telephone: ");
        jtelephone.setForeground(Color.BLACK);
        jtelephone.setFont(new Font("Consolas", 0, 14));
        
        JLabel jemail = new JLabel();
        jemail.setText("Email: ");
        jemail.setForeground(Color.BLACK);
        jemail.setFont(new Font("Consolas", 0, 14));
        
        JLabel jdob = new JLabel();
        jdob.setText("Date Of Birth: ");
        jdob.setForeground(Color.BLACK);
        jdob.setFont(new Font("Consolas", 0, 14));
        
        JLabel jheight = new JLabel();
        jheight.setText("Height: ");
        jheight.setForeground(Color.BLACK);
        jheight.setFont(new Font("Consolas", 0, 14));
        
        JLabel jneck = new JLabel();
        jneck.setText("Neck: ");
        jneck.setForeground(Color.BLACK);
        jneck.setFont(new Font("Consolas", 0, 14));
        
        JLabel jchest = new JLabel();
        jchest.setText("Chest: ");
        jchest.setForeground(Color.BLACK);
        jchest.setFont(new Font("Consolas", 0, 14));
        
        JLabel jbust = new JLabel();
        jbust.setText("Bust: ");
        jbust.setForeground(Color.BLACK);
        jbust.setFont(new Font("Consolas", 0, 14));
        
        JLabel jwaist = new JLabel();
        jwaist.setText("Waist: ");
        jwaist.setForeground(Color.BLACK);
        jwaist.setFont(new Font("Consolas", 0, 14));
        
        JLabel jHighwaist = new JLabel();
        jHighwaist.setText("High Waist: ");
        jHighwaist.setForeground(Color.BLACK);
        jHighwaist.setFont(new Font("Consolas", 0, 14));
        
        JLabel jhip = new JLabel();
        jhip.setText("Hip: ");
        jhip.setForeground(Color.BLACK);
        jhip.setFont(new Font("Consolas", 0, 14));
        
        JLabel jbHeight = new JLabel();
        jbHeight.setText("Bust Height: ");
        jbHeight.setForeground(Color.BLACK);
        jbHeight.setFont(new Font("Consolas", 0, 14));
        
        JLabel jbDistance = new JLabel();
        jbDistance.setText("Breast Distance: ");
        jbDistance.setForeground(Color.BLACK);
        jbDistance.setFont(new Font("Consolas", 0, 14));
        
        JLabel jShoulder = new JLabel();
        jShoulder.setText("Shoulder: ");
        jShoulder.setForeground(Color.BLACK);
        jShoulder.setFont(new Font("Consolas", 0, 14));
        
        JLabel jstUnderbust = new JLabel();
        jstUnderbust.setText("Shoulder To Underbust: ");
        jstUnderbust.setForeground(Color.BLACK);
        jstUnderbust.setFont(new Font("Consolas", 0, 14));
        
        JLabel jfwLength = new JLabel();
        jfwLength.setText("Front Waist Length: ");
        jfwLength.setForeground(Color.BLACK);
        jfwLength.setFont(new Font("Consolas", 0, 14));
        
        JLabel jbwLength = new JLabel();
        jbwLength.setText("Back Waist Length: ");
        jbwLength.setForeground(Color.BLACK);
        jbwLength.setFont(new Font("Consolas", 0, 14));
        
        JLabel jbWidth = new JLabel();
        jbWidth.setText("Back Width: ");
        jbWidth.setForeground(Color.BLACK);
        jbWidth.setFont(new Font("Consolas", 0, 14));
        
        JLabel jbsWidth = new JLabel();
        jbsWidth.setText("Back Shoulder Width: ");
        jbsWidth.setForeground(Color.BLACK);
        jbsWidth.setFont(new Font("Consolas", 0, 14));
        
        JLabel jarm = new JLabel();
        jarm.setText("Arm: ");
        jarm.setForeground(Color.BLACK);
        jarm.setFont(new Font("Consolas", 0, 14));
        
        JLabel jelbow = new JLabel();
        jelbow.setText("Elbow: ");
        jelbow.setForeground(Color.BLACK);
        jelbow.setFont(new Font("Consolas", 0, 14));
        
        JLabel jwrist = new JLabel();
        jwrist.setText("Wrist: ");
        jwrist.setForeground(Color.BLACK);
        jwrist.setFont(new Font("Consolas", 0, 14));
        
        JLabel jblouseLength = new JLabel();
        jblouseLength.setText("Blouse Length: ");
        jblouseLength.setForeground(Color.BLACK);
        jblouseLength.setFont(new Font("Consolas", 0, 14));
        
        JLabel jElength = new JLabel();
        jElength.setText("Elbow Length: ");
        jElength.setForeground(Color.BLACK);
        jElength.setFont(new Font("Consolas", 0, 14));
        
        JLabel jSleevelength = new JLabel();
        jSleevelength.setText("Sleeve Length: ");
        jSleevelength.setForeground(Color.BLACK);
        jSleevelength.setFont(new Font("Consolas", 0, 14));
        
        JLabel jDlength = new JLabel();
        jDlength.setText("Dress Length(until knee): ");
        jDlength.setForeground(Color.BLACK);
        jDlength.setFont(new Font("Consolas", 0, 14));
        
        JLabel jDlength1 = new JLabel();
        jDlength1.setText("Dress Length(until floor): ");
        jDlength1.setForeground(Color.BLACK);
        jDlength1.setFont(new Font("Consolas", 0, 14));
        
        JLabel jSlength = new JLabel();
        jSlength.setText("Skirt Length(until knee): ");
        jSlength.setForeground(Color.BLACK);
        jSlength.setFont(new Font("Consolas", 0, 14));
        
        JLabel jSlength1 = new JLabel();
        jSlength1.setText("Skirt Length(until floor): ");
        jSlength1.setForeground(Color.BLACK);
        jSlength1.setFont(new Font("Consolas", 0, 14));
        
        JLabel jkneeLength = new JLabel();
        jkneeLength.setText("Knee Length: ");
        jkneeLength.setForeground(Color.BLACK);
        jkneeLength.setFont(new Font("Consolas", 0, 14));
        
        JLabel jtLength = new JLabel();
        jtLength.setText("Trouser Length: ");
        jtLength.setForeground(Color.BLACK);
        jtLength.setFont(new Font("Consolas", 0, 14));
        
        JLabel jcrotchLength = new JLabel();
        jcrotchLength.setText("Crotch Length: ");
        jcrotchLength.setForeground(Color.BLACK);
        jcrotchLength.setFont(new Font("Consolas", 0, 14));
        
        JLabel jkCircumference = new JLabel();
        jkCircumference.setText("Knee Circumference: ");
        jkCircumference.setForeground(Color.BLACK);
        jkCircumference.setFont(new Font("Consolas", 0, 14));
        
        JLabel jtCircumference = new JLabel();
        jtCircumference.setText("Thigh Circumference: ");
        jtCircumference.setForeground(Color.BLACK);
        jtCircumference.setFont(new Font("Consolas", 0, 14));
        
        JLabel jaCircumference = new JLabel();
        jaCircumference.setText("Ankle Circumference: ");
        jaCircumference.setForeground(Color.BLACK);
        jaCircumference.setFont(new Font("Consolas", 0, 14));
        
                
        //Setting the JTextfields
        JTextField Search = new JTextField();
        Search.setBackground(Color.WHITE);
        Search.setFont(new Font("Consolas",0,15));
        
        JTextField Name = new JTextField();
        Name.setBackground(Color.WHITE);
        Name.setFont(new Font("Consolas",0,15));
        
        JTextField Address = new JTextField();
        Address.setBackground(Color.WHITE);
        Address.setFont(new Font("Consolas",0,15));
        
        JTextField Telephone = new JTextField();
        Telephone.setBackground(Color.WHITE);
        Telephone.setFont(new Font("Consolas",0,15));
        Telephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
               char a = evt.getKeyChar();
                if (!((a >= '0') && (a <= '9') || (a == KeyEvent.VK_BACK_SPACE)|| (a == KeyEvent.VK_DELETE))){
            
                evt.consume();
            }
            }
        });
        
        
        
        JTextField Email = new JTextField();
        Email.setBackground(Color.WHITE);
        Email.setFont(new Font("Consolas",0,15));
        
        JTextField Dob = new JTextField();
        Dob.setBackground(Color.WHITE);
        Dob.setFont(new Font("Consolas",0,15));
        
        JTextField Height = new JTextField();
        Height.setBackground(Color.WHITE);
        Height.setFont(new Font("Consolas",0,15));
        
        JTextField Neck = new JTextField();
        Neck.setBackground(Color.WHITE);
        Neck.setFont(new Font("Consolas",0,15));
        
        JTextField Chest = new JTextField();
        Chest.setBackground(Color.WHITE);
        Chest.setFont(new Font("Consolas",0,15));
        
        JTextField Bust = new JTextField();
        Bust.setBackground(Color.WHITE);
        Bust.setFont(new Font("Consolas",0,15));
        
        JTextField Waist = new JTextField();
        Waist.setBackground(Color.WHITE);
        Waist.setFont(new Font("Consolas",0,15));
        
        JTextField Hip = new JTextField();
        Hip.setBackground(Color.WHITE);
        Hip.setFont(new Font("Consolas",0,15));
        
        JTextField BustHeight = new JTextField();
        BustHeight.setBackground(Color.WHITE);
        BustHeight.setFont(new Font("Consolas",0,15));
        
        JTextField highWaist = new JTextField();
        highWaist.setBackground(Color.WHITE);
        highWaist.setFont(new Font("Consolas",0,15));
        
        JTextField shoulder = new JTextField();
        shoulder.setBackground(Color.WHITE);
        shoulder.setFont(new Font("Consolas",0,15));
        
        JTextField Bdistance = new JTextField();
        Bdistance.setBackground(Color.WHITE);
        Bdistance.setFont(new Font("Consolas",0,15));
        
        JTextField STunderbust = new JTextField();
        STunderbust.setBackground(Color.WHITE);
        STunderbust.setFont(new Font("Consolas",0,15));
        
        JTextField FWlength = new JTextField();
        FWlength.setBackground(Color.WHITE);
        FWlength.setFont(new Font("Consolas",0,15));
        
        JTextField BWlength = new JTextField();
        BWlength.setBackground(Color.WHITE);
        BWlength.setFont(new Font("Consolas",0,15));
        
        JTextField Bwidth = new JTextField();
        Bwidth.setBackground(Color.WHITE);
        Bwidth.setFont(new Font("Consolas",0,15));
        
        JTextField BSwidth = new JTextField();
        BSwidth.setBackground(Color.WHITE);
        BSwidth.setFont(new Font("Consolas",0,15));
        
        JTextField Arm = new JTextField();
        Arm.setBackground(Color.WHITE);
        Arm.setFont(new Font("Consolas",0,15));
        
        JTextField Elbow = new JTextField();
        Elbow.setBackground(Color.WHITE);
        Elbow.setFont(new Font("Consolas",0,15));
        
        JTextField Wrist = new JTextField();
        Wrist.setBackground(Color.WHITE);
        Wrist.setFont(new Font("Consolas",0,15));
        
        JTextField Blouselength = new JTextField();
        Blouselength.setBackground(Color.WHITE);
        Blouselength.setFont(new Font("Consolas",0,15));
        
        JTextField Elbow_length = new JTextField();
        Elbow_length.setBackground(Color.WHITE);
        Elbow_length.setFont(new Font("Consolas",0,15));
        
        JTextField sleeveLength = new JTextField();
        sleeveLength.setBackground(Color.WHITE);
        sleeveLength.setFont(new Font("Consolas",0,15));
        
        JTextField dLength = new JTextField();
        dLength.setBackground(Color.WHITE);
        dLength.setFont(new Font("Consolas",0,15));
        
        JTextField d_Length = new JTextField();
        d_Length.setBackground(Color.WHITE);
        d_Length.setFont(new Font("Consolas",0,15));
        
        JTextField sLength = new JTextField();
        sLength.setBackground(Color.WHITE);
        sLength.setFont(new Font("Consolas",0,15));
        
        JTextField s_Length = new JTextField();
        s_Length.setBackground(Color.WHITE);
        s_Length.setFont(new Font("Consolas",0,15));
        
        JTextField Kneelength = new JTextField();
        Kneelength.setBackground(Color.WHITE);
        Kneelength.setFont(new Font("Consolas",0,15));
        
        JTextField Tlength = new JTextField();
        Tlength.setBackground(Color.WHITE);
        Tlength.setFont(new Font("Consolas",0,15));
        
        JTextField Crotchlength = new JTextField();
        Crotchlength.setBackground(Color.WHITE);
        Crotchlength.setFont(new Font("Consolas",0,15));
        
        JTextField Kcircum = new JTextField();
        Kcircum.setBackground(Color.WHITE);
        Kcircum.setFont(new Font("Consolas",0,15));
        
        JTextField Tcircum = new JTextField();
        Tcircum.setBackground(Color.WHITE);
        Tcircum.setFont(new Font("Consolas",0,15));
        
        JTextField Anklecircum = new JTextField();
        Anklecircum.setBackground(Color.WHITE);
        Anklecircum.setFont(new Font("Consolas",0,15));
        
        //Setting Next panel text Display
        JTextField jName = new JTextField();
        jName.setBackground(Color.WHITE);
        jName.setFont(new Font("Consolas",0,15));
        
        JTextField jAddress = new JTextField();
        jAddress.setBackground(Color.WHITE);
        jAddress.setFont(new Font("Consolas",0,15));
        
        JTextField jTelephone = new JTextField();
        jTelephone.setBackground(Color.WHITE);
        jTelephone.setFont(new Font("Consolas",0,15));
       
        JTextField jEmail = new JTextField();
        jEmail.setBackground(Color.WHITE);
        jEmail.setFont(new Font("Consolas",0,15));
        
        JTextField jDob = new JTextField();
        jDob.setBackground(Color.WHITE);
        jDob.setFont(new Font("Consolas",0,15));
        
        JTextField jHeight = new JTextField();
        jHeight.setBackground(Color.WHITE);
        jHeight.setFont(new Font("Consolas",0,15));
        
        JTextField jNeck = new JTextField();
        jNeck.setBackground(Color.WHITE);
        jNeck.setFont(new Font("Consolas",0,15));
        
        JTextField jChest = new JTextField();
        jChest.setBackground(Color.WHITE);
        jChest.setFont(new Font("Consolas",0,15));
        
        JTextField jBust = new JTextField();
        jBust.setBackground(Color.WHITE);
        jBust.setFont(new Font("Consolas",0,15));
        
        JTextField jWaist = new JTextField();
        jWaist.setBackground(Color.WHITE);
        jWaist.setFont(new Font("Consolas",0,15));
        
        JTextField jhighWaist = new JTextField();
        jhighWaist.setBackground(Color.WHITE);
        jhighWaist.setFont(new Font("Consolas",0,15));
        
        JTextField jHip = new JTextField();
        jHip.setBackground(Color.WHITE);
        jHip.setFont(new Font("Consolas",0,15));
        
        JTextField jBustHeight = new JTextField();
        jBustHeight.setBackground(Color.WHITE);
        jBustHeight.setFont(new Font("Consolas",0,15));
        
        JTextField jBdistance = new JTextField();
        jBdistance.setBackground(Color.WHITE);
        jBdistance.setFont(new Font("Consolas",0,15));
        
        JTextField jshoulder = new JTextField();
        jshoulder.setBackground(Color.WHITE);
        jshoulder.setFont(new Font("Consolas",0,15));
        
        JTextField jSTunderbust = new JTextField();
        jSTunderbust.setBackground(Color.WHITE);
        jSTunderbust.setFont(new Font("Consolas",0,15));
        
        JTextField jFWlength = new JTextField();
        jFWlength.setBackground(Color.WHITE);
        jFWlength.setFont(new Font("Consolas",0,15));
        
        JTextField jBWlength = new JTextField();
        jBWlength.setBackground(Color.WHITE);
        jBWlength.setFont(new Font("Consolas",0,15));
        
        JTextField jBwidth = new JTextField();
        jBwidth.setBackground(Color.WHITE);
        jBwidth.setFont(new Font("Consolas",0,15));
        
        JTextField jBSwidth = new JTextField();
        jBSwidth.setBackground(Color.WHITE);
        jBSwidth.setFont(new Font("Consolas",0,15));
        
        JTextField jArm = new JTextField();
        jArm.setBackground(Color.WHITE);
        jArm.setFont(new Font("Consolas",0,15));
        
        JTextField jElbow = new JTextField();
        jElbow.setBackground(Color.white);
        jElbow.setFont(new Font("Consolas", 0, 14));
        
        JTextField jWrist = new JTextField();
        jWrist.setBackground(Color.white);
        jWrist.setFont(new Font("Consolas", 0, 14));
        
        JTextField jBlouselength = new JTextField();
        jBlouselength.setBackground(Color.white);
        jBlouselength.setFont(new Font("Consolas", 0, 14));
        
        JTextField jeLength = new JTextField();
        jeLength.setBackground(Color.white);
        jeLength.setFont(new Font("Consolas", 0, 14));
        
        JTextField jsleeveLength = new JTextField();
        jsleeveLength.setBackground(Color.white);
        jsleeveLength.setFont(new Font("Consolas", 0, 14));
        
        JTextField jdLength = new JTextField();
        jdLength.setBackground(Color.white);
        jdLength.setFont(new Font("Consolas", 0, 14));
        
        JTextField jdLength1 = new JTextField();
        jdLength1.setBackground(Color.white);
        jdLength1.setFont(new Font("Consolas", 0, 14));
        
        JTextField jsLength = new JTextField();
        jsLength.setBackground(Color.white);
        jsLength.setFont(new Font("Consolas", 0, 14));
        
        JTextField jsLength1 = new JTextField();
        jsLength1.setBackground(Color.white);
        jsLength1.setFont(new Font("Consolas", 0, 14));
        
        JTextField jKneelength = new JTextField();
        jKneelength.setBackground(Color.white);
        jKneelength.setFont(new Font("Consolas", 0, 14));
        
        JTextField jTlength = new JTextField();
        jTlength.setBackground(Color.white);
        jTlength.setFont(new Font("Consolas", 0, 14));
        
        JTextField jCrotchlength = new JTextField();
        jCrotchlength.setBackground(Color.white);
        jCrotchlength.setFont(new Font("Consolas", 0, 14));
        
        JTextField jKcircumference = new JTextField();
        jKcircumference.setBackground(Color.white);
        jKcircumference.setFont(new Font("Consolas", 0, 14));
               
        JTextField jTcircumference = new JTextField();
        jTcircumference.setBackground(Color.white);
        jTcircumference.setFont(new Font("Consolas", 0, 14));
        
        JTextField jAcircumference = new JTextField();
        jAcircumference.setBackground(Color.white);
        jAcircumference.setFont(new Font("Consolas", 0, 14));
        
        JButton save = new JButton();
        save.setText("SAVE");
        save.setBackground(Color.BLACK);
        save.setForeground(Color.WHITE);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) { 
                try{
                    String qry =  "INSERT INTO `CustomerTable`(`Name`, `Address`, `Telephone`, `Email`, `DateofBirth`, `Height`, `Neck`,"
                            + "`Chest`, `Bust`, `Waist`,`Highwaist`, `Hip`, `BustHeight`, `BreastDistance`,`Shoulder`, `Shoulderunderbust`, `Frontwaist`,"
                            + "`Backwaist`, `Backwidth`, `Backshoulder`,`Arm`, `Elbow`, `Wrist`,`Blouselength`, `Elbowlength`, `Sleevelength`,"
                            + "`Dresslength`, `Dress_length`, `Skirtlength`, `Skirt_length`,`Kneelength`, `Trouserlength`, `Crotchlength`,"
                            + "`Kneecircum`, `Thighcircum`, `Anklecircum`)"
                            
                            + " VALUES ('"+Name.getText()+"','"+Dob.getText()+"','"+Telephone.getText()+"','"+Email.getText()+"','"+Dob.getText()+"',"
                            + "'"+Height.getText()+"','"+Neck.getText()+"','"+Chest.getText()+"','"+Bust.getText()+"','"+Waist.getText()+"','"+highWaist.getText()+"','"+Hip.getText()+"',"
                            + "'"+BustHeight.getText()+"','"+Bdistance.getText()+"','"+shoulder.getText()+"','"+STunderbust.getText()+"','"+FWlength.getText()+"','"+BWlength.getText()+"',"
                            + "'"+Bwidth.getText()+"','"+BSwidth.getText()+"','"+Arm.getText()+"','"+Elbow.getText()+"','"+Wrist.getText()+"','"+Blouselength.getText()+"','"+Elbow_length.getText()+"',"
                            + "'"+sleeveLength.getText()+"','"+dLength.getText()+"','"+d_Length.getText()+"','"+sLength.getText()+"','"+s_Length.getText()+"','"+Kneelength.getText()+"',"
                            + "'"+Tlength.getText()+"','"+Crotchlength.getText()+"','"+Kcircum.getText()+"','"+Tcircum.getText()+"','"+Anklecircum.getText()+"')"; 
                    
                Statement in_st = con.createStatement();
                int c = in_st.executeUpdate(qry);
                    
                if(c == 1){
                    JOptionPane.showMessageDialog(null, "Record Saved!!!");
                    Name.setText("");
                    Address.setText("");
                    Telephone.setText("");
                    Email.setText("");
                    Dob.setText("");
                    Height.setText("");
                    Neck.setText("");
                    Chest.setText("");
                    Bust.setText("");
                    Waist.setText("");
                    highWaist.setText("");
                    Hip.setText("");
                    BustHeight.setText("");
                    Bdistance.setText("");
                    shoulder.setText("");
                    STunderbust.setText("");
                    FWlength.setText("");
                    BWlength.setText("");
                    Bwidth.setText("");
                    BSwidth.setText("");
                    Arm.setText("");
                    Elbow.setText("");
                    Wrist.setText("");
                    Blouselength.setText("");
                    Elbow_length.setText("");
                    sleeveLength.setText("");
                    dLength.setText("");
                    d_Length.setText("");
                    sLength.setText("");
                    s_Length.setText("");
                    Kneelength.setText("");
                    Tlength.setText("");
                    Crotchlength.setText("");
                    Kcircum.setText("");
                    Tcircum.setText("");
                    Anklecircum.setText("");
                }else{
                  JOptionPane.showMessageDialog(null, "Record Not Saved!!!");
                }
                    
                }catch(Exception ex){
                    System.err.println(ex.getMessage());
                ex.printStackTrace();
            }
                   
            }
        });
        
        JButton view = new JButton();
        view.setText("VIEW");
        view.setBackground(Color.BLACK);
        view.setForeground(Color.WHITE);
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MainPanel.removeAll();
                MainPanel.repaint();
                MainPanel.revalidate();
                MainPanel.add(jps);
                MainPanel.repaint();
                MainPanel.revalidate();
                
            }
        });
        
        JButton back = new JButton();
        back.setText("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MainPanel.removeAll();
                MainPanel.repaint();
                MainPanel.revalidate();
                MainPanel.add(jp);
                MainPanel.repaint();
                MainPanel.revalidate();
                
                Search.setText("");
                jName.setText("");
                jAddress.setText("");
                jTelephone.setText("");
                jEmail.setText("");
                jDob.setText("");
                jHeight.setText("");
                jNeck.setText("");
                jChest.setText("");
                jBust.setText("");
                jWaist.setText("");
                jhighWaist.setText("");
                jHip.setText("");
                jBustHeight.setText("");
                jBdistance.setText("");
                jshoulder.setText("");
                jSTunderbust.setText("");
                jFWlength.setText("");
                jBWlength.setText("");
                jBwidth.setText("");
                jBSwidth.setText("");
                jArm.setText("");
                jElbow.setText("");
                jWrist.setText("");
                jBlouselength.setText("");
                jeLength.setText("");
                jsleeveLength.setText("");
                jdLength.setText("");
                jdLength1.setText("");
                jsLength.setText("");
                jsLength1.setText("");
                jKneelength.setText("");
                jTlength.setText("");
                jCrotchlength.setText("");
                jKcircumference.setText("");
                jTcircumference.setText("");
                jAcircumference.setText(""); 
                       
            }
        });
        
        JButton Searchs = new JButton();
        Searchs.setText("SEARCH");
        Searchs.setBackground(Color.BLACK);
        Searchs.setForeground(Color.WHITE);
        Searchs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String search_name = Search.getText();
                
                try{
                    String qry = "SELECT * FROM CustomerTable WHERE Name = '"+search_name+"'";
                    
                    rs = stmt.executeQuery(qry);
                    
                  while(rs.next()){
                  JOptionPane.showMessageDialog(null, "Record Found!!!");
                  
                  jName.setText((rs.getString("Name")));
                  jAddress.setText(rs.getString("Address"));
                  jTelephone.setText(rs.getString("Telephone"));
                  jEmail.setText(rs.getString("Email"));
                  jDob.setText(rs.getString("DateofBirth"));
                  jHeight.setText(rs.getString("Height"));
                  jNeck.setText(rs.getString("Neck"));
                  jChest.setText(rs.getString("Chest"));
                  jBust.setText(rs.getString("Bust"));
                  jWaist.setText(rs.getString("Waist"));
                  jhighWaist.setText(rs.getString("Highwaist"));
                  jHip.setText(rs.getString("Hip"));
                  jBustHeight.setText(rs.getString("Bustheight"));
                  jBdistance.setText(rs.getString("BreastDistance"));
                  jshoulder.setText(rs.getString("Shoulder"));
                  jSTunderbust.setText(rs.getString("Shoulderunderbust"));
                  jFWlength.setText(rs.getString("Frontwaist"));
                  jBWlength.setText(rs.getString("Backwaist"));
                  jBwidth.setText(rs.getString("Backwidth"));
                  jBSwidth.setText(rs.getString("Backshoulder"));
                  jArm.setText(rs.getString("Arm"));
                  jElbow.setText(rs.getString("Elbow"));
                  jWrist.setText(rs.getString("Wrist"));
                  jBlouselength.setText(rs.getString("Blouselength"));
                  jeLength.setText(rs.getString("Elbowlength"));
                  jsleeveLength.setText(rs.getString("Sleevelength"));
                  jdLength.setText(rs.getString("Dresslength"));
                  jdLength1.setText(rs.getString("Dress_length"));
                  jsLength.setText(rs.getString("Skirtlength"));
                  jsLength1.setText(rs.getString("Skirt_length"));
                  jKneelength.setText(rs.getString("Kneelength"));
                  jTlength.setText(rs.getString("Trouserlength"));
                  jCrotchlength.setText(rs.getString("Crotchlength"));
                  jKcircumference.setText(rs.getString("Kneecircum"));
                  jTcircumference.setText(rs.getString("Thighcircum"));
                  jAcircumference.setText(rs.getString("Anklecircum"));
                        
                }
                       
                    
                }catch(Exception e){
                    e.printStackTrace();
                }
                
            }
        });
        
        JButton delete = new JButton();
        delete.setText("DELETE");
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.WHITE);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String search_name = Search.getText();
                
                try{
                    String qry = "DELETE FROM CustomerTable WHERE Name = '"+search_name+"'";
                    
                    Statement del = con.createStatement();
                    int rs = del.executeUpdate(qry);
              
                if (rs == 1){
                  JOptionPane.showMessageDialog(null, "Record Deleted!!!");
                    jName.setText("");
                    jAddress.setText("");
                    jTelephone.setText("");
                    jEmail.setText("");
                    jDob.setText("");
                    jHeight.setText("");
                    jNeck.setText("");
                    jChest.setText("");
                    jBust.setText("");
                    jWaist.setText("");
                    jhighWaist.setText("");
                    jHip.setText("");
                    jBustHeight.setText("");
                    jBdistance.setText("");
                    jshoulder.setText("");
                    jSTunderbust.setText("");
                    jFWlength.setText("");
                    jBWlength.setText("");
                    jBwidth.setText("");
                    jBSwidth.setText("");
                    jArm.setText("");
                    jElbow.setText("");
                    jWrist.setText("");
                    jBlouselength.setText("");
                    jeLength.setText("");
                    jsleeveLength.setText("");
                    jdLength.setText("");
                    jdLength1.setText("");
                    jsLength.setText("");
                    jsLength1.setText("");
                    jKneelength.setText("");
                    jTlength.setText("");
                    jCrotchlength.setText("");
                    jKcircumference.setText("");
                    jTcircumference.setText("");
                    jAcircumference.setText("");
                        
                }else{
                    JOptionPane.showMessageDialog(null, "No Record to Delete!!!");
                }
                    
                    
                }catch(Exception e){
                    e.printStackTrace();
                }
                
            }
        });
        
        JButton edit = new JButton();
        edit.setText("UPDATE");
        edit.setBackground(Color.BLACK);
        edit.setForeground(Color.WHITE);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String search_name = Search.getText();
                
                try{
                    String qry = "UPDATE `CustomerTable` SET `Name`='"+jName.getText()+"', `Address`='"+jAddress.getText()+"',"
                            + " `Telephone`='"+jTelephone.getText()+"', `Email`='"+jEmail.getText()+"', `DateofBirth`='"+jDob.getText()+"',"
                            + " `Height`='"+jHeight.getText()+"', `Neck`='"+jNeck.getText()+"',`Chest`='"+jChest.getText()+"', `Bust`='"+jBust.getText()+"',"
                            + " `Waist`='"+jWaist.getText()+"',`Highwaist`='"+jhighWaist.getText()+"', `Hip`='"+jHip.getText()+"',`BustHeight`='"+jBustHeight.getText()+"', `BreastDistance`='"+jBdistance.getText()+"',"
                            + " `Shoulder`='"+jshoulder.getText()+"',`Shoulderunderbust`='"+jSTunderbust.getText()+"',`Frontwaist`='"+jFWlength.getText()+"',`Backwaist`='"+jBWlength.getText()+"',`Backwidth`='"+jBwidth.getText()+"',"
                            + " `Backshoulder`='"+jBSwidth.getText()+"',`Arm`='"+jArm.getText()+"', `Elbow`='"+jElbow.getText()+"', `Wrist`='"+jWrist.getText()+"',`Blouselength`='"+jBlouselength.getText()+"',"
                            + " `Elbowlength`='"+jeLength.getText()+"',`Sleevelength`='"+jsleeveLength.getText()+"',`Dresslength`='"+jdLength.getText()+"', `Dress_length`='"+jdLength1.getText()+"',"
                            + "`Skirtlength`='"+jsLength.getText()+"',`Skirt_length`='"+jsLength1.getText()+"',`Kneelength`='"+jKneelength.getText()+"', `Trouserlength`='"+jTlength.getText()+"',"
                            + "`Crotchlength`='"+jCrotchlength.getText()+"',`Kneecircum`='"+jKcircumference.getText()+"', `Thighcircum`='"+jTcircumference.getText()+"',`Anklecircum`='"+jAcircumference.getText()+"' WHERE  `Name` = '"+search_name+"'";
                    
                    Statement Up = con.createStatement();
                    int rs = Up.executeUpdate(qry);
                    
                    if(rs == 1){
                
                    JOptionPane.showMessageDialog(null, "Record Updated!!!");
                    jName.setText("");
                    jAddress.setText("");
                    jTelephone.setText("");
                    jEmail.setText("");
                    jDob.setText("");
                    jHeight.setText("");
                    jNeck.setText("");
                    jChest.setText("");
                    jBust.setText("");
                    jWaist.setText("");
                    jhighWaist.setText("");
                    jHip.setText("");
                    jBustHeight.setText("");
                    jBdistance.setText("");
                    jshoulder.setText("");
                    jSTunderbust.setText("");
                    jFWlength.setText("");
                    jBWlength.setText("");
                    jBwidth.setText("");
                    jBSwidth.setText("");
                    jArm.setText("");
                    jElbow.setText("");
                    jWrist.setText("");
                    jBlouselength.setText("");
                    jeLength.setText("");
                    jsleeveLength.setText("");
                    jdLength.setText("");
                    jdLength1.setText("");
                    jsLength.setText("");
                    jsLength1.setText("");
                    jKneelength.setText("");
                    jTlength.setText("");
                    jCrotchlength.setText("");
                    jKcircumference.setText("");
                    jTcircumference.setText("");
                    jAcircumference.setText("");
                
                    }else{
                        JOptionPane.showMessageDialog(null, "Record was not Updated!!!");
                    }
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                
            }
        });
            
        
        
        jp.add(header, new AbsoluteConstraints(0,0,800,50));
        jps.add(search, new AbsoluteConstraints(0,10,250,50));
        jps.add(Search, new AbsoluteConstraints(150,13,400,40));
        header.add(title, new AbsoluteConstraints(250,10,300,50));
        jp.add(details, new AbsoluteConstraints(250,216,300,50));
        jp.add(Tdetails, new AbsoluteConstraints(250,550,300,50));
        jps.add(jdetails, new AbsoluteConstraints(250,216,300,50));
        jps.add(jTdetails, new AbsoluteConstraints(250,550,300,50));
        jp.add(save, new AbsoluteConstraints(600,600,100,40));
        jp.add(view, new AbsoluteConstraints(600,647,100,40));
        jps.add(back, new AbsoluteConstraints(600,600,100,40));
        jps.add(Searchs, new AbsoluteConstraints(600,13,100,40));
        jps.add(delete, new AbsoluteConstraints(600,60,100,40));
        jps.add(edit, new AbsoluteConstraints(600,107,100,40));
        
        //Setting Label Positions
        jp.add(name, new AbsoluteConstraints(5,45,100,50));
        jp.add(address, new AbsoluteConstraints(5,80,100,50));
        jp.add(telephone, new AbsoluteConstraints(5,115,100,50));
        jp.add(email, new AbsoluteConstraints(5,148,100,50));
        jp.add(dob, new AbsoluteConstraints(5,178,150,50));
        jp.add(height, new AbsoluteConstraints(0,250,150,50));
        jp.add(neck, new AbsoluteConstraints(0,283,150,50));
        jp.add(chest, new AbsoluteConstraints(0,316,150,50));
        jp.add(bust, new AbsoluteConstraints(0,349,150,50));
        jp.add(waist, new AbsoluteConstraints(0,382,150,50));
        jp.add(Highwaist, new AbsoluteConstraints(0,415,150,50));
        jp.add(hip, new AbsoluteConstraints(0,448,150,50));
        jp.add(bHeight, new AbsoluteConstraints(0,481,150,50));
        jp.add(bDistance, new AbsoluteConstraints(214,250,140,50));
        jp.add(Shoulder, new AbsoluteConstraints(214,283,150,50));
        jp.add(stUnderbust, new AbsoluteConstraints(214,316,200,50));
        jp.add(fwLength, new AbsoluteConstraints(214,349,200,50));
        jp.add(bwLength, new AbsoluteConstraints(214,382,200,50));
        jp.add(bWidth, new AbsoluteConstraints(214,415,150,50));
        jp.add(bsWidth, new AbsoluteConstraints(214,448,200,50));
        jp.add(arm, new AbsoluteConstraints(214,481,150,50));
        jp.add(elbow, new AbsoluteConstraints(480,250,150,50));
        jp.add(wrist, new AbsoluteConstraints(480,283,150,50));
        jp.add(blouseLength, new AbsoluteConstraints(480,316,150,50));
        jp.add(Elength, new AbsoluteConstraints(480,349,150,50));
        jp.add(Sleevelength, new AbsoluteConstraints(480,382,150,50));
        jp.add(Dlength, new AbsoluteConstraints(480,415,230,50));
        jp.add(Dlength1, new AbsoluteConstraints(480,448,230,50));
        jp.add(Slength, new AbsoluteConstraints(480,481,230,50));
        jp.add(Slength1, new AbsoluteConstraints(480,514,230,50));
        jp.add(kneeLength, new AbsoluteConstraints(0,590,150,50));
        jp.add(tLength, new AbsoluteConstraints(280,590,150,50));
        jp.add(crotchLength, new AbsoluteConstraints(0,630,150,50));
        jp.add(kCircumference, new AbsoluteConstraints(280,630,200,50));
        jp.add(tCircumference, new AbsoluteConstraints(0,670,200,50));
        jp.add(aCircumference, new AbsoluteConstraints(280,670,200,50));
        
        
        
        //Setting TextFields Positions
        jp.add(Name, new AbsoluteConstraints(45,58,500,30));
        jp.add(Address, new AbsoluteConstraints(68,90,477,30));
        jp.add(Telephone, new AbsoluteConstraints(85,123,460,30));
        jp.add(Email, new AbsoluteConstraints(52,156,493,30));
        jp.add(Dob, new AbsoluteConstraints(115,188,430,30));
        jp.add(Height, new AbsoluteConstraints(55,260,150,30));
        jp.add(Neck, new AbsoluteConstraints(40,293,165,30));
        jp.add(Chest, new AbsoluteConstraints(46,326,159,30));
        jp.add(Bust, new AbsoluteConstraints(40,359,165,30));
        jp.add(Waist, new AbsoluteConstraints(46,392,159,30));
        jp.add(highWaist, new AbsoluteConstraints(87,425,117,30));
        jp.add(Hip, new AbsoluteConstraints(30,458,175,30));
        jp.add(BustHeight, new AbsoluteConstraints(95,491,110,30));
        jp.add(Bdistance, new AbsoluteConstraints(340,260,135,30));
        jp.add(shoulder, new AbsoluteConstraints(284,293,191,30));
        jp.add(STunderbust, new AbsoluteConstraints(390,325,85,30));
        jp.add(FWlength, new AbsoluteConstraints(365,359,110,30));
        jp.add(BWlength, new AbsoluteConstraints(357,392,118,30));
        jp.add(Bwidth, new AbsoluteConstraints(302,425,173,30));
        jp.add(BSwidth, new AbsoluteConstraints(374,458,101,30));
        jp.add(Arm, new AbsoluteConstraints(245,491,230,30));
        jp.add(Elbow, new AbsoluteConstraints(528,260,252,30));
        jp.add(Wrist, new AbsoluteConstraints(528,293,252,30));
        jp.add(Blouselength, new AbsoluteConstraints(590,325,190,30));
        jp.add(Elbow_length, new AbsoluteConstraints(582,359,198,30));
        jp.add(sleeveLength, new AbsoluteConstraints(590,392,190,30));
        jp.add(dLength, new AbsoluteConstraints(680,425,100,30));
        jp.add(d_Length, new AbsoluteConstraints(687,458,93,30));
        jp.add(sLength, new AbsoluteConstraints(680,491,100,30));
        jp.add(s_Length, new AbsoluteConstraints(687,524,93,30));
        jp.add(Kneelength, new AbsoluteConstraints(95,600,165,30));
        jp.add(Tlength, new AbsoluteConstraints(400,600,180,30));
        jp.add(Crotchlength, new AbsoluteConstraints(110,640,150,30));
        jp.add(Kcircum, new AbsoluteConstraints(430,640,150,30));
        jp.add(Tcircum, new AbsoluteConstraints(158,680,102,30));
        jp.add(Anklecircum, new AbsoluteConstraints(440,680,140,30));
        
        //Setting Next Label Layouts
        jps.add(jname, new AbsoluteConstraints(5,45,100,50));
        jps.add(jaddress, new AbsoluteConstraints(5,80,100,50));
        jps.add(jtelephone, new AbsoluteConstraints(5,115,100,50));
        jps.add(jemail, new AbsoluteConstraints(5,148,100,50));
        jps.add(jdob, new AbsoluteConstraints(5,178,150,50));
        jps.add(jheight, new AbsoluteConstraints(0,250,150,50));
        jps.add(jneck, new AbsoluteConstraints(0,283,150,50));
        jps.add(jchest, new AbsoluteConstraints(0,316,150,50));
        jps.add(jbust, new AbsoluteConstraints(0,349,150,50));
        jps.add(jwaist, new AbsoluteConstraints(0,382,150,50));
        jps.add(jHighwaist, new AbsoluteConstraints(0,415,150,50));
        jps.add(jhip, new AbsoluteConstraints(0,448,150,50));
        jps.add(jbHeight, new AbsoluteConstraints(0,481,150,50));
        jps.add(jbDistance, new AbsoluteConstraints(214,250,140,50));
        jps.add(jShoulder, new AbsoluteConstraints(214,283,150,50));
        jps.add(jstUnderbust, new AbsoluteConstraints(214,316,200,50));
        jps.add(jfwLength, new AbsoluteConstraints(214,349,200,50));
        jps.add(jbwLength, new AbsoluteConstraints(214,382,200,50));
        jps.add(jbWidth, new AbsoluteConstraints(214,415,150,50));
        jps.add(jbsWidth, new AbsoluteConstraints(214,448,200,50));
        jps.add(jarm, new AbsoluteConstraints(214,481,150,50));
        jps.add(jelbow, new AbsoluteConstraints(480,250,150,50));
        jps.add(jwrist, new AbsoluteConstraints(480,283,150,50));
        jps.add(jblouseLength, new AbsoluteConstraints(480,316,150,50));
        jps.add(jElength, new AbsoluteConstraints(480,349,150,50));
        jps.add(jSleevelength, new AbsoluteConstraints(480,382,150,50));
        jps.add(jDlength, new AbsoluteConstraints(480,415,230,50));
        jps.add(jDlength1, new AbsoluteConstraints(480,448,230,50));
        jps.add(jSlength, new AbsoluteConstraints(480,481,230,50));
        jps.add(jSlength1, new AbsoluteConstraints(480,514,230,50));
        jps.add(jkneeLength, new AbsoluteConstraints(0,590,150,50));
        jps.add(jtLength, new AbsoluteConstraints(280,590,150,50));
        jps.add(jcrotchLength, new AbsoluteConstraints(0,630,150,50));
        jps.add(jkCircumference, new AbsoluteConstraints(280,630,200,50));
        jps.add(jtCircumference, new AbsoluteConstraints(0,670,200,50));
        jps.add(jaCircumference, new AbsoluteConstraints(280,670,200,50));
        
        //Setting Next Panel label display
        jps.add(jName, new AbsoluteConstraints(45,58,500,30));
        jps.add(jAddress, new AbsoluteConstraints(68,90,477,30));
        jps.add(jTelephone, new AbsoluteConstraints(85,123,460,30));
        jps.add(jEmail, new AbsoluteConstraints(52,156,493,30));
        jps.add(jDob, new AbsoluteConstraints(115,188,430,30));
        jps.add(jHeight, new AbsoluteConstraints(55,260,150,30));
        jps.add(jNeck, new AbsoluteConstraints(40,293,165,30));
        jps.add(jChest, new AbsoluteConstraints(46,326,159,30));
        jps.add(jBust, new AbsoluteConstraints(40,359,165,30));
        jps.add(jWaist, new AbsoluteConstraints(46,392,159,30));
        jps.add(jhighWaist, new AbsoluteConstraints(87,425,117,30));
        jps.add(jHip, new AbsoluteConstraints(30,458,175,30));
        jps.add(jBustHeight, new AbsoluteConstraints(95,491,110,30));
        jps.add(jBdistance, new AbsoluteConstraints(340,260,135,30));
        jps.add(jshoulder, new AbsoluteConstraints(284,293,191,30));
        jps.add(jSTunderbust, new AbsoluteConstraints(390,325,85,30));
        jps.add(jFWlength, new AbsoluteConstraints(365,359,110,30));
        jps.add(jBWlength, new AbsoluteConstraints(357,392,118,30));
        jps.add(jBwidth, new AbsoluteConstraints(302,425,173,30));
        jps.add(jBSwidth, new AbsoluteConstraints(374,458,101,30));
        jps.add(jArm, new AbsoluteConstraints(245,491,230,30));
        jps.add(jElbow, new AbsoluteConstraints(528,260,252,30));
        jps.add(jWrist, new AbsoluteConstraints(528,293,252,30));
        jps.add(jBlouselength, new AbsoluteConstraints(590,325,190,30));
        jps.add(jeLength, new AbsoluteConstraints(582,359,198,30));
        jps.add(jsleeveLength, new AbsoluteConstraints(590,392,190,30));
        jps.add(jdLength, new AbsoluteConstraints(680,425,100,30));
        jps.add(jdLength1, new AbsoluteConstraints(687,458,93,30));
        jps.add(jsLength, new AbsoluteConstraints(680,491,100,30));
        jps.add(jsLength1, new AbsoluteConstraints(687,524,93,30));
        jps.add(jKneelength, new AbsoluteConstraints(95,600,165,30));
        jps.add(jTlength, new AbsoluteConstraints(400,600,180,30));
        jps.add(jCrotchlength, new AbsoluteConstraints(110,640,150,30));
        jps.add(jKcircumference, new AbsoluteConstraints(430,640,150,30));
        jps.add(jTcircumference, new AbsoluteConstraints(158,680,102,30));
        jps.add(jAcircumference, new AbsoluteConstraints(440,680,140,30));
        
        
        
        
        
        j.add(MainPanel);
        MainPanel.add(jp);
        j.setVisible(true);
        
    }
    
    
    public static void main (String [] args){
        new FashionDesign();
    }
    
}
