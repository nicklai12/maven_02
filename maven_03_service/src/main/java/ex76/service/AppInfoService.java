package ex76.service;

import ex76.domain.AppInfo;

public interface AppInfoService {
    /**
     * 保存
     * @param appInfo
     * @return
     */
    public boolean save(AppInfo appInfo);

    /**
     * 修改
     * @param appInfo
     * @return
     */
    public boolean update(AppInfo appInfo);

    /**
     * 按id查找
     * @param id
     * @return
     */
    public AppInfo getById(Integer id);
}
