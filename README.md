# Bungeecord LoadBalancing
Ce projet n'étais jamais censé sortir dans le public, mais vu que je n'en ai plus l'utilité et que je pense que c'est utile pour d'autres, je vous le partage.

Quand le joueur se connecte sur un le proxy bungeecord, nous récupérons la liste des serveurs et le nombre de joueurs (Dev1,Dev2,Dev3) et nous envoyons le joueur sur le serveur le moins utilisé. Afin qu'il ne perde pas ses données, nous sauvegardons sur quel serveur il a été redirigé et il sera automatiquement transféré dessus lors de la prochaine connexion.

Ce code n'est pas forcément propre, ce sont mes débuts et dernières fois en Java donc soyez indulgent. J'utilise des extraits de la lib de @Litarvan afin de sauvegarder les données des joueurs. Vous êtes libres de le réutiliser partout voire-même de contribuer :3