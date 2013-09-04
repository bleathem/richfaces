package org.richfaces.resource.mapping;

import java.net.URL;

import javax.faces.context.FacesContext;

public interface ResourceMapping {

    URL getURL(FacesContext context);
}