package ch.hsr.isf.serepo.client.webapp.event;

public class AppEvent {

  public static class SelectSeItemInTree {
    private String uriOfSeItem;

    public SelectSeItemInTree(String uriOfSeItem) {
      this.uriOfSeItem = uriOfSeItem;
    }

    public String getUriOfSeItem() {
      return uriOfSeItem;
    }

  }

  public static class TitleChangeEvent {
    private final String title;

    public TitleChangeEvent(String title) {
      this.title = title;
    }

    public String getTitle() {
      return title;
    }

  }
  
  public static class GlobalSearchField {
    
    public static class Visible {
      private boolean visible;
  
      public Visible(boolean visible) {
        this.visible = visible;
      }
  
      public boolean isVisible() {
        return visible;
      }
    }
    
  }

  public static class ItemDoubleClickevent<T> {
    private final T item;

    public ItemDoubleClickevent(T item) {
      this.item = item;
    }

    public T getItem() {
      return item;
    }
  }

  public static class UserLoginRequestEvent {
    private final String username;
    private final String email;

    public UserLoginRequestEvent(String username, String email) {
      this.username = username;
      this.email = email;
    }

    public String getUsername() {
      return username;
    }

    public String getEmail() {
      return email;
    }

  }

  public static class UserLogoutEvent {
  }

}
