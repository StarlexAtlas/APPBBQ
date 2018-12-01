### 论坛

##### 发布帖子：

```json
url: /post/upload
参数：
  data: 各种信息
  MultipartFile[]: 图片数组

略略略
```

##### 删除帖子：

```json
url: /post/delete
参数：
  id: 帖子id
{
    "code": 0,
    "status": success,  
    "obj":null            
}
```



##### 获取 帖子列表：

```json

url: /post/getPostList

{
  "code": 0,
  "status": "success",
  "obj": "[{\"uid\":\"61\",\"commentNumber\":0,\"id\":1,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":2,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":3,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":4,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":5,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":6,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":7,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":8,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"63\",\"commentNumber\":0,\"id\":9,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"63\",\"commentNumber\":0,\"id\":10,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"}]"
}
```

##### 获取帖子详情

```json
url: /post/detail

参数：
  id:  帖子id；

返回值：

  {
  "code": 0,
  "status": "success",
  "obj": "{\"commentId\":\"\",\"content\":\"[{\\\"content\\\":\\\"觉得就到家\\\\n\\\",\\\"type\\\":1},{\\\"content\\\":\\\"http://202.194.15.133:8380/isdu/forum/img/61_5627393873873.jpg\\\",\\\"type\\\":0},{\\\"content\\\":\\\"喜欢小姐姐\\\\n妙啊\\\\n\\\",\\\"type\\\":1},{\\\"content\\\":\\\"http://202.194.15.133:8380/isdu/forum/img/61_5627393908719.jpg\\\",\\\"type\\\":0},{\\\"content\\\":\\\"我觉得ok哦\\\\n难兄难弟你都不\\\",\\\"type\\\":1},{\\\"content\\\":\\\"http://202.194.15.133:8380/isdu/forum/img/61_5627393926950.jpg\\\",\\\"type\\\":0},{\\\"content\\\":\\\"蛤蛤蛤\\\\n奖学金对你的把你的\\\\n\\\",\\\"type\\\":1},{\\\"content\\\":\\\"http://202.194.15.133:8380/isdu/forum/img/61_5627393947565.jpg\\\",\\\"type\\\":0},{\\\"content\\\":\\\"嘻嘻心看得见啊好吧好的\\\\n烦恼上课你懂不懂的马赛克都见不到九点半打开看到你的f\\\\n\\\",\\\"type\\\":1},{\\\"content\\\":\\\"http://202.194.15.133:8380/isdu/forum/img/61_5627393972103.jpg\\\",\\\"type\\\":0},{\\\"content\\\":\\\"\\\",\\\"type\\\":1}]\"}"
}
```

##### 删除评论

```json
url: /comment/delete

参数：

  id:

{
    "code": 0,
    "status": success,  
    "obj":null            
}

```

##### 点赞和收藏：

```
url： /post/like                  /post/collect

参数：
postId:
userId:

{
    "code": 0,
    "status": success,  
    "obj":null            
}

```



##### 判断是否点赞/收藏

```json
url： /post/isLike                  /post/isCollect

参数：
	userId
	postId

返回值：
	true 
	false
```



##### 获得收藏的帖子

```json
url: /user/getCollect
参数：
	userId:

返回值：

{
  "code": 0,
  "status": "success",
  "obj": "[{\"uid\":\"63\",\"commentNumber\":12,\"id\":29,\"time\":\"1532308911923\",\"title\":\"emmm\",\"collectNumber\":0,\"likeNumber\":1,\"info\":\"妙啊\\n哈哈哈\"}]"
}
```



##### 关注用户

```json
url: /user/like

参数：
	userId:
	beLikeUserId:

返回值：

	{
    "code": 0,
    "status": success,  
    "obj":null            
	}
```



##### 获取我关注的用户/关注我的用户id

```json
url: /user/getLike              /user/getLikeMe

参数：
	userId

返回值：

	{
    "code": 0,
    "status": success,  
    "obj":61-63-15-64-54-68           
	}
```

##### 获取热帖列表（十条

```json
url: /post/getHotTen

参数：
  startValue：从该值起获取比之小的10条记录    第一次获取为0
#value值唯一  算法 
#                                      #整数部分                             
#value=100000*(1*likeNUmber+2*commentNumber)+(time%100000000000/1000000)+
                    #小数部分
       # (time%100000)/100000

return:

{
  "code": 0,
  "status": "success",
  "obj": "[{\"uid\":\"61\",\"commentNumber\":0,\"id\":1,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":2,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":3,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":4,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":5,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":6,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":7,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":8,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"63\",\"commentNumber\":0,\"id\":9,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"63\",\"commentNumber\":0,\"id\":10,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"}]"
}
```

##### 获得校园相关列表（十条

```json
url: /post/getSchoolAboutTen

参数：
  startId：开始Id   
return:

{
  "code": 0,
  "status": "success",
  "obj": "[{\"uid\":\"61\",\"commentNumber\":0,\"id\":1,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":2,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":3,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":4,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":5,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":6,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":7,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":8,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"63\",\"commentNumber\":0,\"id\":9,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"63\",\"commentNumber\":0,\"id\":10,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"}]"
}
```

##### 获得推荐（十条

```json
参数：
url : 
  startValue：    2*likeNumber+commentNumber+0.id
return:

{
  "code": 0,
  "status": "success",
  "obj": "[{\"uid\":\"61\",\"commentNumber\":0,\"id\":1,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":2,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":3,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":4,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":5,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":6,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":7,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"61\",\"commentNumber\":0,\"id\":8,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"63\",\"commentNumber\":0,\"id\":9,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"},{\"uid\":\"63\",\"commentNumber\":0,\"id\":10,\"collectNumber\":0,\"likeNumber\":0,\"info\":\"暂无简介\"}]"
}
```

##### 获得关注的帖子(全部一次甩给你了

```json
url: /user/getCollect
参数：
	userId:


返回值：

{
  "code": 0,
  "status": "success",
  "obj": "[{\"uid\":\"63\",\"commentNumber\":12,\"id\":29,\"time\":\"1532308911923\",\"title\":\"emmm\",\"collectNumber\":0,\"likeNumber\":1,\"info\":\"妙啊\\n哈哈哈\"}]"
}
```



##### 获取评论（十条

```json
url: /user/getComment10

Params:
	userId
	startId   第一次为0

return：
{
  "code": 0,
  "status": "success",
  "obj": "[{\"fatherCommenrId\":-1,\"commentId\":\"\",\"id\":40,\"postId\":57,\"time\":\"1532428863382\",\"userId\":\"61\",\"content\":\"嘻嘻嘻\"},{\"fatherCommenrId\":-1,\"commentId\":\"\",\"id\":37,\"postId\":56,\"time\":\"1532427243932\",\"userId\":\"61\",\"content\":\"太强了！\"},{\"fatherCommenrId\":-1,\"commentId\":\"\",\"id\":34,\"postId\":52,\"time\":\"1532415302788\",\"userId\":\"61\",\"content\":\"冬冬nb！\"},{\"fatherCommenrId\":-1,\"commentId\":\"\",\"id\":33,\"postId\":53,\"time\":\"1532414691461\",\"userId\":\"61\",\"content\":\"方姐来互粉啊！\"},{\"fatherCommenrId\":-1,\"commentId\":\"\",\"id\":30,\"postId\":53,\"time\":\"1532414348229\",\"userId\":\"61\",\"content\":\"方姐你好皮\"},{\"fatherCommenrId\":-1,\"commentId\":\"\",\"id\":25,\"postId\":51,\"time\":\"1532403515220\",\"userId\":\"61\",\"content\":\"太强了！\"},{\"fatherCommenrId\":-1,\"commentId\":\"\",\"id\":1,\"postId\":29,\"time\":\"1532308922200\",\"userId\":\"61\",\"content\":\"评论1\"}]"
}

```

##### 获取关注帖子

```json
url: /post/getLikePostTen

prarms：
	userId: 
	startId:       //第一次请求为0

#已为倒叙排列

//example: http://127.0.0.1:8384/post/getLikePostTen?userId=1&startId=0
//user.getLikeids() = 3-;
{"code":0,"status":"success","obj":"[{\"uid\":\"3\",\"commentNumber\":0,\"id\":4,\"time\":\"1533088860049\",\"title\":\"蛤\",\"collectNumber\":0,\"likeNumber\":1,\"info\":\"蛤蛤蛤\"},{\"uid\":\"3\",\"commentNumber\":4,\"id\":3,\"time\":\"1533050501479\",\"title\":\"zznb\",\"collectNumber\":2,\"likeNumber\":3,\"info\":\"妙啊\"}]"}
```

##### 发表评论

```json
url: /comment/add

params:
	content:
	userId:  发表评论的用户id
	postId： 
	fatherCommenrId：-1  //预留功能，目前都为-1即可
	time： 
	toUserId： 发表被回复评论的用户id

return: 
	{"code":0,"status":"success","obj":null}
```

##### 论询请求

```json
url: /notice/getNotice

Params：
	userId

return:
{
  "code": 0,
  "status": "success",
  "obj": "[{\"senderId\":\"2\",\"type\":\"beLikeUser\"},{\"senderId\":\"3\",\"type\":\"beLikeUser\"},
{\"senderId\":\"4\",\"type\":\"beLikeUser\"},{\"senderId\":\"5\",\"type\":\"beLikeUser\"}]"
}

//更新后obj里每条jsonobj全部参数有 type、senderId、senderNickname、senderAvatar、content、time

#其中被评论、被回复评论和点赞都有 postId 参数返回

//关于 type 的值：
	//beLikeUser： 被关注
	//beLikePost： 被点赞
	//beCommentPost：	被评论
	//beCommentComment： 被回复评论

//关于 content 的值：
	//type == beLikeUser： “你被 '#{nickname}' 小哥哥关注了哟！/小姐姐关注了哟！赶快去撩她！”
	//type == beLikePost： "你的帖子 '#{title}' 被 '#{nickname}' 点赞了哟"
	//type == beCommentPost： "#{评论的内容}"
	//type == beCommentComment： "#{nickname} 回复了你的评论"

没有消息则返回

{"code":0,"status":"no","obj":null}

#注：每次读完我就把数据清空，客户端存本地。
```

##### 