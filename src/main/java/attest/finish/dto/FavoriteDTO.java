package attest.finish.dto;

public class FavoriteDTO {
    private Long id;
    private Long userId;
    private Long resourceId;

    public FavoriteDTO() {
    }

    public FavoriteDTO(Long id, Long userId, Long resourceId) {
        this.id = id;
        this.userId = userId;
        this.resourceId = resourceId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }
}