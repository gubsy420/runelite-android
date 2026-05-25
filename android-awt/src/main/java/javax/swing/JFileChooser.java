package javax.swing;

import java.awt.Component;
import java.io.File;
import javax.swing.filechooser.FileFilter;

public class JFileChooser extends JComponent {
    private static final long serialVersionUID = 1L;

    public static final int OPEN_DIALOG = 0;
    public static final int SAVE_DIALOG = 1;
    public static final int CUSTOM_DIALOG = 2;
    public static final int CANCEL_OPTION = 1;
    public static final int APPROVE_OPTION = 0;
    public static final int ERROR_OPTION = -1;
    public static final int FILES_ONLY = 0;
    public static final int DIRECTORIES_ONLY = 1;
    public static final int FILES_AND_DIRECTORIES = 2;

    private File currentDirectory = new File(".");
    private File selectedFile;
    private int fileSelectionMode = FILES_ONLY;
    private boolean multiSelectionEnabled;
    private FileFilter fileFilter;

    public JFileChooser() {}
    public JFileChooser(String currentDirectoryPath) { currentDirectory = new File(currentDirectoryPath); }
    public JFileChooser(File currentDirectory) { this.currentDirectory = currentDirectory; }

    public File getSelectedFile() { return selectedFile; }
    public void setSelectedFile(File file) { this.selectedFile = file; }
    public File[] getSelectedFiles() { return selectedFile == null ? new File[0] : new File[]{selectedFile}; }
    public void setSelectedFiles(File[] selectedFiles) {}
    public File getCurrentDirectory() { return currentDirectory; }
    public void setCurrentDirectory(File dir) { this.currentDirectory = dir; }
    public int getFileSelectionMode() { return fileSelectionMode; }
    public void setFileSelectionMode(int mode) { this.fileSelectionMode = mode; }
    public boolean isMultiSelectionEnabled() { return multiSelectionEnabled; }
    public void setMultiSelectionEnabled(boolean b) { this.multiSelectionEnabled = b; }
    public FileFilter getFileFilter() { return fileFilter; }
    public void setFileFilter(FileFilter filter) { this.fileFilter = filter; }
    public void addChoosableFileFilter(FileFilter filter) {}
    public boolean removeChoosableFileFilter(FileFilter f) { return false; }
    public FileFilter[] getChoosableFileFilters() { return new FileFilter[0]; }
    public int showOpenDialog(Component parent) { return CANCEL_OPTION; }
    public int showSaveDialog(Component parent) { return CANCEL_OPTION; }
    public int showDialog(Component parent, String approveButtonText) { return CANCEL_OPTION; }
    public void setDialogTitle(String dialogTitle) {}
    public String getDialogTitle() { return null; }
    public void setDialogType(int dialogType) {}
    public int getDialogType() { return OPEN_DIALOG; }
}
