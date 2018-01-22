package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.UserPostTab;
import org.springframework.stereotype.Repository;


@Repository(value="userPostDao")
public interface UserPostDao {
	/**
	 * 添加用户岗位关系
	 * @param up
	 */
	public void addUserPost(UserPostTab up);
	/**
	 * 根据用户ID删除用户岗位关系
	 * @param userId
	 */
	public void deleteUserPostByUserId(String userId);
	/**
	 * 根据处室ID删除用户岗位关系
	 * @param postId
	 */
	public void deleteUserPostByPostId(String postId);
}
