package org.richfaces.resource.mapping;

import java.net.URL;

import javax.faces.context.FacesContext;

public class StaticURLResourceMapping implements ResourceMapping {

    private URL url;

    public StaticURLResourceMapping(URL url) {
        this.url = url;
    }

    public URL getURL(FacesContext context) {
        return url;
    }
}
