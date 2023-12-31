# DigDigApp
## 概要
DigDigAppはJava版[Minecraftプラグインの鉱石採掘ゲーム[(DigDig)](https://github.com/tai442/DigDig.git)のゲーム時間や鉱石点数をカスタマイズするWebアプリケーションです。
## 機能
[Webアプリにアクセス](http://digdig-alb-1749034478.ap-northeast-1.elb.amazonaws.com)することで以下の機能を実行できます:
1. 【ゲーム結果の取得】最新のゲーム結果が10件表示されます。
2. 【現在のゲーム時間の取得】現在設定されているゲーム時間を確認できます。
3. 【現在の鉱石点数の取得】現在設定されている鉱石の種類と点数がセットで確認できます。
4. 【ゲーム時間の更新】ゲーム時間に任意の秒数（１〜９９）を入力し更新できます。
5. 【鉱石点数の更新】**選択肢から鉱石を選択**し、点数（１〜９９）を入力することで任意の点数に更新できます。  
## 動作環境  
awsのEC2上にデプロイされたMinecraftサーバーで実行できます。  
サーバーを追加してサーバーアドレスに「**54.64.250.181**」を入力してください。  
詳しくは、[説明動画](https://youtu.be/mFVMt-t8yx4)をご覧ください。
- Minecraft 1.20.1
- Spigot Server 1.20.1
- Oracle OpenJDK 17.0.6
## ゲームの仕様 
鉱石採掘ゲームの詳細についてはこちらをご確認ください。
- [DigDig](https://github.com/tai442/DigDig.git)
- [ゲーム説明動画](https://youtu.be/WqAqVxleHys)
