package ex76.dao;


import ex76.domain.AppInfo;

import java.util.List;

public interface AppInfoDao {
    public void save(AppInfo appInfo);
    public void update(AppInfo appInfo);
    public void delete(Integer id);

    public AppInfo getById(Integer id);
    public List<AppInfo> getAll();
}
