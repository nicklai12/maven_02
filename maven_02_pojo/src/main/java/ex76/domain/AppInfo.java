package ex76.domain;

public class AppInfo {
    private String author;
    private Integer id;
    private String name;
    private String remark;
    private String version;

    @Override
    public String toString() {
        return "AppInfo{" +
                "author='" + author + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                ", version='" + version + '\'' +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
