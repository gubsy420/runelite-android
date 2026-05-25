package java.awt;

public class Dialog extends Window {
    private static final long serialVersionUID = 5036553639616394035L;

    public enum ModalityType {
        MODELESS, DOCUMENT_MODAL, APPLICATION_MODAL, TOOLKIT_MODAL
    }

    public enum ModalExclusionType {
        NO_EXCLUDE, APPLICATION_EXCLUDE, TOOLKIT_EXCLUDE
    }

    private String title = "";
    private ModalityType modality = ModalityType.MODELESS;

    public Dialog(Frame owner) { super(owner); }
    public Dialog(Frame owner, String title) { super(owner); this.title = title == null ? "" : title; }
    public Dialog(Frame owner, boolean modal) { super(owner); this.modality = modal ? ModalityType.APPLICATION_MODAL : ModalityType.MODELESS; }
    public Dialog(Frame owner, String title, boolean modal) { super(owner); this.title = title == null ? "" : title; this.modality = modal ? ModalityType.APPLICATION_MODAL : ModalityType.MODELESS; }
    public Dialog(Window owner) {}
    public Dialog(Window owner, String title) { this.title = title == null ? "" : title; }
    public Dialog(Window owner, ModalityType modality) { this.modality = modality; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title == null ? "" : title; }
    public ModalityType getModalityType() { return modality; }
    public void setModalityType(ModalityType type) { this.modality = type; }
    public boolean isModal() { return modality != ModalityType.MODELESS; }
    public void setModal(boolean modal) { this.modality = modal ? ModalityType.APPLICATION_MODAL : ModalityType.MODELESS; }
    public boolean isResizable() { return true; }
    public void setResizable(boolean resizable) {}
    public boolean isUndecorated() { return false; }
    public void setUndecorated(boolean undecorated) {}
}
