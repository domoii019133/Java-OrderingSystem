# Hello , This is Ordering system

設計以顧客自動點餐為導向系統，並搭配廚房出餐進度。後台設計進貨與調撥庫存，及業績報表分析。

**Functions are as follows:**
1. 加入會員
2. 點餐
3. 結帳
4. 出餐
5. 銷售報告

## 系統架構圖
![](https://i.imgur.com/xVP0ftm.jpg)

---

## 首頁
這是首頁，有菜單訂購、加入會員、員工管裡

![](https://i.imgur.com/VJs9zKs.jpg)

## 加入會員
這是加入會員的網頁，輸入姓名與電話號碼，電話號碼作為登入使用。

![](https://i.imgur.com/u5aLLRQ.png)

## 會員登入
會員註冊成功後，回到首頁右上方有「會員登入」，輸入剛註冊過的電話號碼來登入。

![](https://i.imgur.com/DOOvlGq.jpg)

## 開始訂購
看到右上方有顯示會員姓名，那就是登入成功，可以開始選購菜單。

![](https://i.imgur.com/LwNgxEy.jpg)

選購完成，請移到下方處的「確認點餐」按鈕。

![](https://i.imgur.com/EuvxW2F.jpg)

## 點餐明細確認
這是給會員確認點餐是否無誤，無誤的話就可以點「確認下訂」，有誤的話，請到右下方按「回首頁」重新訂購。

![](https://i.imgur.com/eCdyYn5.png)

## 員工管裡
最初員工帳號密碼只有BOSS才有專屬的帳號密碼，若要幫員工新增員工專用的帳號密碼時，必須新建員工資料才可以使用。

**輸入BOSS專屬的帳號密碼**
![](https://i.imgur.com/roPaPDA.jpg)

## 員工功能
登入成功的畫面，有「結帳」、「廚房出餐」、「原料進貨」、「原料調撥」、<br>
「員工資料建檔」、「廠商資料建檔」、「報表分析」的功能。

![](https://i.imgur.com/OheFDCQ.png)

**首先先幫剛點餐完成的會員做結帳動作，點擊「未結帳單」按鈕 -> 未結帳清單列表，就可以看到會員剛訂購完成的訂購編號**
![](https://i.imgur.com/mlZhL8U.png)

**看到會員訂購的明細後，按下「確認」按鈕，系統會將訂購明細傳送至廚房，廚房即可看到點餐明細。**
![](https://i.imgur.com/mOo0Exg.png)

**廚房負責人收到點餐明細，開始做處理動作，通知廚師準備製作，製作完成就可以按下「確認」。**
![](https://i.imgur.com/F02kfFI.png)

**如果碰上物料不夠時，立即填寫資料，系統將明細傳送給倉庫管理員儘快補貨。**
![](https://i.imgur.com/4I95kqQ.png)

**這是確認要補貨的資料，確認OK，填入要進貨的員工帳號，能夠知道是誰要求補貨的。**
![](https://i.imgur.com/LgoO9KB.png)

**這是補貨的明細表，確認OK，按下「確認下訂」按鈕。**
![](https://i.imgur.com/nRd15Qu.png)

**訂購完成，系統將會通知倉庫管理員，按右下角回到主選單。**
![](https://i.imgur.com/3l2Ml58.jpg)

**物料用完時，要準備從倉庫調貨時，立即填寫資料，系統將明細傳送給倉庫管理員做確認動作。**
![](https://i.imgur.com/0VMgDF2.png)

**這是確認要調貨的資料，確認OK，填入要調貨的員工帳號，能夠知道是誰要求調貨的。**
![](https://i.imgur.com/CsLUJ5e.png)

**這是調貨的明細表，確認OK，按下「確認調撥」按鈕。**<br>
![](https://i.imgur.com/Q1fpyah.png)

**調撥完成，系統將會通知倉庫管理員，按右下角回到主選單。**<br>
![](https://i.imgur.com/YrIuzMj.png)

**如果有新進的員工，會建立員工資料，方便查閱及管理，且新進員工可以使用員工管理功能。**<br>
![](https://i.imgur.com/tkvZfkS.png)

**系統顯示建檔成功訊息，如果還要再建立員工資料，按下「返回上一頁」，如果不需要，按下「回主選單」。**
![](https://i.imgur.com/Pm9gLq8.png)

**如果有與新廠商合作，會建立廠商資料，方便查閱與管理。**<br>
![](https://i.imgur.com/Jwc7CFD.png)

**系統顯示建檔成功訊息，如果還要再建立廠商資料，按下「返回上一頁」，如果不需要，按下「回主選單」。**
![](https://i.imgur.com/nKamnvI.png)

**銷售報告有分為「日報表」、「月報表」、「年報表」**<br>
![](https://i.imgur.com/HszqjMj.png)

**查看「日報表」，系統顯示當月的幾號，要查看幾號的報表。**<br>
**※備註：圖片日期是2018-01-11，報表僅有到11號的記錄。**<br>
![](https://i.imgur.com/lPeLg7Y.png)

**選擇「11號」的日報表，並顯示「11號」的銷售記錄。**
![](https://i.imgur.com/Y1rJC2C.png)

**按上方的「重新選擇」，即可重新選擇「日報表」、「月報表」、「年報表」。**
![](https://i.imgur.com/TMDqHyn.png)

**查看「月報表」，系統顯示當年的幾月，要查看幾月的報表。**<br>
**※備註：圖片日期是2018-01-11，報表僅有到1月的記錄**<br>
![](https://i.imgur.com/Litbsii.png)

**選擇「1月」的月報表，並顯示「1月」的銷售記錄。**
![](https://i.imgur.com/moxonr2.png)

**查看「年報表」，系統顯示年份，要查看幾年的報表。**<br>
**※備註：圖片日期是2018-01-11，報表僅有到2018年的記錄**<br>
![](https://i.imgur.com/aQQ08nk.png)

**選擇「2018年」的年報表，並顯示「2018年」的銷售記錄**
![](https://i.imgur.com/u9BVev4.png)
