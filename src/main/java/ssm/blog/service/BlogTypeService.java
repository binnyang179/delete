package ssm.blog.service;

import org.springframework.stereotype.Service;
import ssm.blog.entity.BlogType;
import ssm.blog.entity.PageBean;

import java.util.List;

public interface BlogTypeService {

    //分页查询
    PageBean<BlogType> listByPage(PageBean<BlogType> pageBean);

    // 获取总记录数
    public Long getTotal();

    // 添加博客类别
    public Integer addBlogType(BlogType blogType);

    // 更新博客类别
    public Integer updateBlogType(BlogType blogType);

    // 删除博客类别
    public Integer deleteBlogType(Integer id);

    public List<BlogType> getBlogTypeData();

}
