package com.github.gwtbootstrap.client.ui;

import java.util.Iterator;

import com.github.gwtbootstrap.client.ui.base.HasIcon;
import com.github.gwtbootstrap.client.ui.base.HasStyle;
import com.github.gwtbootstrap.client.ui.base.IsResponsive;
import com.github.gwtbootstrap.client.ui.base.Style;
import com.github.gwtbootstrap.client.ui.constants.Device;
import com.github.gwtbootstrap.client.ui.constants.IconSize;
import com.github.gwtbootstrap.client.ui.constants.IconType;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

/**
 * The tab widget for {@link TabPanel}.
 * 
 * <p>
 * It's for UiBinder.
 * Tab class provide easy syntax on UiBinder.
 * </p>
 * Example:
 * <pre>
 * {@code
 * <b:TabPanel>
 *  <b:Tab heading="Typically">
 *    <b:Heading size="3">Typically Tab</b:Heading>
 *    <b:Paragraph>
 *        huhuhu hahha
 *    </b:Paragraph>
 *  </b:Tab>
 * </b:TabPanel>
 * }
 * </pre>
 * 
 * 
 * 
 * }
 * 
 * </pre>
 * @since 2.0.4.0
 * @author ohashi keisuke
 */
public class Tab implements IsWidget, HasWidgets, HasClickHandlers,HasStyle, IsResponsive,HasIcon {
    
    TabLink link = new TabLink();

    /**
     * Create tmpy tab
     */
    public Tab() {
        TabPane tabPane = new TabPane();
        
        tabPane.setHref(DOM.createUniqueId());
        
        link.setTablePane(tabPane);
    }
    
    /**
     * Tab as a TabLink
     */
    @Override
    public Widget asWidget() {
        return link;
    }
    
    /**
     * Get Container TabPane
     * @return TabPane
     */
    protected TabPane getTabPane() {
        return link.getTabPane();
    }
    
    /**
     * Return TabLink
     * @return tabLink
     */
    public TabLink asTabLink() {
        return link;
    }
    
    /**
     * Set tab active
     * @param active
     */
    public void setActive(boolean active) {
        link.setActive(active);
    }
    
    public boolean isActive() {
        return link.isActive();
    }
    
    /**
     * Set tab text
     * @param text tab text
     */
    public void setHeading(String text) {
        link.setText(text);
    }
    
    /**
     * Get Tab text
     * @return tab text
     */
    public String getHeading() {
        return link.getText();
    }
    
    /**
     * Add widget to tab pane.
     */
    @Override
    public void add(Widget w) {
        link.getTabPane().add(w);
    }

    /**
     * Clear tab pane children
     */
    @Override
    public void clear() {
        link.getTabPane().clear();
    }

    @Override
    public Iterator<Widget> iterator() {
        return link.getTabPane().iterator();
    }

    @Override
    public boolean remove(Widget w) {
        return link.getTabPane().remove(w);
    }

    @Override
    public HandlerRegistration addClickHandler(ClickHandler handler) {
        return link.addClickHandler(handler);
    }

    @Override
    public void setIcon(IconType type) {
        link.setIcon(type);
    }

    @Override
    public void setIconSize(IconSize size) {
        link.setIconSize(size);
    }

    @Override
    public void setShowOn(Device device) {
        link.setShowOn(device);
        link.getTabPane().setShowOn(device);
    }

    @Override
    public void setHideOn(Device device) {
        link.setHideOn(device);
        link.getTabPane().setHideOn(device);
    }

    @Override
    public void setStyle(Style style) {
        link.setStyle(style);
    }

    @Override
    public void addStyle(Style style) {
        link.addStyle(style);
    }

    @Override
    public void removeStyle(Style style) {
        link.removeStyle(style);
    }

    @Override
    public void fireEvent(GwtEvent<?> event) {
        link.fireEvent(event);
    }
}