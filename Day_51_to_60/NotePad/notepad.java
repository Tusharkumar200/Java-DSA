package NotePad;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class notepad extends Frame implements ActionListener {
    TextArea textArea;
    File currentFile;

    public notepad() {
        setTitle("Java Notepad");
        setSize(600, 400);

        textArea = new TextArea();
        add(textArea, BorderLayout.CENTER);

        MenuBar menuBar = new MenuBar();
        setMenuBar(menuBar);

        Menu fileMenu = new Menu("File");
        menuBar.add(fileMenu);

        MenuItem newMenuItem = new MenuItem("New");
        newMenuItem.addActionListener(this);
        fileMenu.add(newMenuItem);

        MenuItem openMenuItem = new MenuItem("Open");
        openMenuItem.addActionListener(this);
        fileMenu.add(openMenuItem);

        MenuItem saveMenuItem = new MenuItem("Save");
        saveMenuItem.addActionListener(this);
        fileMenu.add(saveMenuItem);

        MenuItem exitMenuItem = new MenuItem("Exit");
        exitMenuItem.addActionListener(this);
        fileMenu.add(exitMenuItem);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("New")) {
            textArea.setText("");
            currentFile = null;
        } else if (command.equals("Open")) {
            FileDialog fileDialog = new FileDialog(this, "Open", FileDialog.LOAD);
            fileDialog.setVisible(true);
            String filename = fileDialog.getFile();
            if (filename != null) {
                try {
                    FileReader reader = new FileReader(fileDialog.getDirectory() + filename);
                    BufferedReader br = new BufferedReader(reader);
                    String line;
                    StringBuilder content = new StringBuilder();
                    while ((line = br.readLine()) != null) {
                        content.append(line).append("\n");
                    }
                    br.close();
                    reader.close();
                    textArea.setText(content.toString());
                    currentFile = new File(fileDialog.getDirectory() + filename);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else if (command.equals("Save")) {
            if (currentFile != null) {
                try {
                    FileWriter writer = new FileWriter(currentFile);
                    writer.write(textArea.getText());
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                FileDialog fileDialog = new FileDialog(this, "Save", FileDialog.SAVE);
                fileDialog.setVisible(true);
                String filename = fileDialog.getFile();
                if (filename != null) {
                    try {
                        FileWriter writer = new FileWriter(fileDialog.getDirectory() + filename);
                        writer.write(textArea.getText());
                        writer.close();
                        currentFile = new File(fileDialog.getDirectory() + filename);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } else if (command.equals("Exit")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new notepad();
    }
}
