# 删除名字为.idea的文件夹
git rm -r --cached .idea

# 提交到git
git commit -m '删除.idea文件夹'

# 推送到GitHub
git push -u origin master