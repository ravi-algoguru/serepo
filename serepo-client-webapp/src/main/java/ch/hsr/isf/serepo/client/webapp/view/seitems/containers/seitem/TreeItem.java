package ch.hsr.isf.serepo.client.webapp.view.seitems.containers.seitem;

import com.vaadin.server.Resource;

public class TreeItem {

  private Object id;
  private String path;
  private String caption;
  private Resource icon;

  public TreeItem(Object id, String path, String caption) {
    this.id = id;
    this.path = path;
    this.caption = caption;
  }
  
  public TreeItem(Object id, String path, String caption, Resource icon) {
    this(id, path, caption);
    this.icon = icon;
  }

  public Object getId() {
    return id;
  }

  public String getPath() {
    return path;
  }

  @Override
  public String toString() {
    return caption;
  }
  
  public Resource getIcon() {
    return icon;
  }
  
  public void setIcon(Resource icon) {
    this.icon = icon;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    TreeItem other = (TreeItem) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}
