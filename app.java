
rasool@DESKTOP-1NA7IVP MINGW64 ~/OneDrive/Desktop/repo1-git (master)
$ cat > f1.txt
this is a text file

rasool@DESKTOP-1NA7IVP MINGW64 ~/OneDrive/Desktop/repo1-git (master)
$ git add .
rasool@DESKTOP-1NA7IVP MINGW64 ~/OneDrive/Desktop/repo1-git (master)
$ git stash save "f1.txt"
Saved working directory and index state On master: f1.txt

rasool@DESKTOP-1NA7IVP MINGW64 ~/OneDrive/Desktop/repo1-git (master)
$ git stash list
stash@{0}: On master: f1.txt
stash@{1}: On master: index.html
