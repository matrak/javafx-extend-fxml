package mrak.jfx.extendfxml;

public class SpecializedButton extends BasicButton {

	public SpecializedButton() {
		super();
		loadFxml(SpecializedButton.class.getResource("SpecializedButton.fxml"), this);
	}
}
