package org.richfaces.resource.mapping;

import java.net.URL;

import javax.faces.context.FacesContext;

import org.richfaces.resource.ResourceKey;

public class ResourceServletMapping implements ResourceMapping {

    private ResourceKey resourceKey;

    public ResourceServletMapping(ResourceKey resourceKey) {
        this.resourceKey = resourceKey;
    }

    @Override
    public URL getURL(FacesContext context) {
        return null;
    }
}
