package ex76.mapper;

import ex76.domain.AppInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AppInfoMapper {
    public void save(AppInfo appInfo);
    public void update(AppInfo appInfo);
//    public void delete(Integer id);

    public AppInfo getById(Integer id);
//    public List<AppInfo> getAll();

}
