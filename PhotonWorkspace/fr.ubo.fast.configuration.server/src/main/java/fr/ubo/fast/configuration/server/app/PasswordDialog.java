package fr.ubo.fast.configuration.server.app;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class PasswordDialog extends Dialog
{
	private Label password_label;
	private Text password_text;
	private String password_label_text;
	private String password;
	

	public PasswordDialog(Shell parentShell, String password_label_text)
	{
		super(parentShell);
		this.password_label_text = password_label_text;
		this.password = "";
	}

	@Override
	protected Control createDialogArea(Composite parent)
	{
		Composite container = (Composite) super.createDialogArea(parent);
		GridLayout layout = new GridLayout(1, true);
		layout.marginRight = 5;
		layout.marginLeft = 10;
		container.setLayout(layout);
		
		GridData grid_data = new GridData(SWT.LEFT, SWT.CENTER, false, false);
		grid_data.horizontalIndent = 1;
		password_label = new Label(container, SWT.NONE);
		password_label.setLayoutData(grid_data);
		password_label.setText(password_label_text);

		password_text = new Text(container, SWT.BORDER | SWT.PASSWORD);
		password_text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		password_text.setText(password);
		password_text.addModifyListener(event ->
		{
			Text text_widget = (Text) event.getSource();
			String password_text_widget = text_widget.getText();
			password = password_text_widget;
		});
		return container;
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent)
	{
		createButton(parent, IDialogConstants.OK_ID, "Confirm", true);
	}

	@Override
	protected Point getInitialSize()
	{
		return new Point(620, 200);
	}

	@Override
	protected void okPressed()
	{
		password = password_text.getText();
		super.okPressed();
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getPasswordLabelText()
	{
		return password_label_text;
	}
	
	public void setPasswordLabelText(String password_label_text)
	{
		this.password_label_text = password_label_text;
	}
}