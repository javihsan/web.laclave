package com.alaclave.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.DecoratedPopupPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class PopupPubli extends DecoratedPopupPanel {
	
	private ApliConstants constants = GWT.create(ApliConstants.class);
	
	public PopupPubli() {

		super();
		 
		setStylePrimaryName("publi-PopupPanel");
		
		Label closeLab = new HTML(constants.avisoPubli());
		closeLab.setStyleName("publi-closeLabel");
				
		Anchor closeLink = new Anchor(constants.linkClosePubli(),true);
		closeLink.addClickHandler( new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				hide();
				
			}
		});
		closeLink.setStyleName("publi-closeLink");
		closeLink.addStyleName("publi-closeLink a");
		
		
		HorizontalPanel publiAvisoPanel = new HorizontalPanel();
		publiAvisoPanel.setStyleName("publi-avisoPanel");
		
		publiAvisoPanel.add(closeLab);
		publiAvisoPanel.setCellHorizontalAlignment(closeLab,HasHorizontalAlignment.ALIGN_RIGHT);
		publiAvisoPanel.add(closeLink);
		publiAvisoPanel.setCellHorizontalAlignment(closeLink,HasHorizontalAlignment.ALIGN_CENTER);
			
		//Label contentLab = new HTML(constants.contentPubli());
		Label contentLab = new HTML("&iexcl;&iexcl;POR FIN!!<br><font class=\"publi-claveLabel\">LA CLAVE</font> DA INICIO A LA ENSE&Ntilde;ANZA DE VIOL&Iacute;N<br>CON PROFESORES/AS<br>DEL M&Aacute;XIMO NIVEL Y EXPERIENCIA.<br>&iexcl;&iexcl;RESERVEN YA SU PLAZA!!");
		contentLab.setStyleName("publi-contentLabel");
		
		Image image = new Image("images/violin_2.jpg");
		
		HorizontalPanel publiContentPanel = new HorizontalPanel();
		publiContentPanel.setStylePrimaryName("publi-contentPanel");
		publiContentPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		publiContentPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		publiContentPanel.add(image);
		publiContentPanel.add(contentLab);
		
		Label contractLab = new HTML(constants.contractPubli());
		contractLab.setStyleName("publi-contractLab");
		
		VerticalPanel verticalPanel = new VerticalPanel();
		verticalPanel.setStyleName("publi-verticalPanel");
		verticalPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
	    
		verticalPanel.add(publiAvisoPanel);
		verticalPanel.add(publiContentPanel);
		verticalPanel.add(contractLab);
			    
		setWidget(verticalPanel);
	    
	}
}
