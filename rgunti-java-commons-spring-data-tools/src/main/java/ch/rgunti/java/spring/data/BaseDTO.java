package ch.rgunti.java.spring.data;

import java.time.LocalDateTime;

public abstract class BaseDTO implements DataTransferObject {

    // --

    protected Long id;
    protected Long version;
    protected LocalDateTime createdAt;
    protected LocalDateTime modifiedAt;

    // --

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }
    public void setVersion(Long version) {
        this.version = version;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }
    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
