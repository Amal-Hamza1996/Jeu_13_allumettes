# Description fonctionelle du Jeu 13 allumettes

Le jeu des 13 allumettes se joue à deux joueurs qui, à tour de rôle, prennent 1, 2 ou 3 allumettes d’un tas qui en contient initialement 13. Le joueur qui prend la dernière allumette perd.
L’application à développer doit permettre à deux joueurs de s’affronter. C’est l’ordinateur qui est l’arbitre de la partie. Il affiche le nombre d’allumettes restant en jeu, donne la main à tour de rôle à chaque joueur et vérifie que les joueurs respectent les règles du jeu. Ainsi, si un joueur
veut prendre trop ou trop peu d’allumettes, le coup est refusé et le joueur doit rejouer. Un joueur
doit retirer entre 1 et 3 allumettes. En fin de partie, l’arbitre affiche le résultat.
Chaque joueur choisit le coup à jouer en fonction d’une stratégie. Une stratégie humain
consiste à demander à l’utilisateur ce qu’il veut jouer. Ceci permet d’avoir un joueur humain.
Les autres stratégies consistent à faire jouer l’ordinateur et définissent son niveau de jeu. Une
liste non exhaustive des niveaux de jeu, et donc des stratégies correspondantes, inclut:


— niveau naïf : l’ordinateur choisit aléatoirement le nombre d’allumettes à jouer.


— niveau rapide : l’ordinateur prend le maximum d’allumettes possible (de manière à ce
que la partie se termine le plus rapidement possible).


— niveau expert : l’ordinateur joue du mieux qu’il peut (s’il peut gagner, il gagnera).

# Architecture


Le diagramme de classe d’analyse, est proposé sur la figure en bas. 


La classe Jeu modélise le plateau du jeu des 13 allumettes, y compris
les règles sur la prise des allumettes. Le jeu est caractérisé par le nombre d’allumettes encore en
présentes, initialement 13.


Il est possible de retirer du jeu un nombre d’allumettes compris entre 1 et 3. 3 est le nombre
maximal d’allumettes que peut prendre un joueur par tour. Bien entendu, il ne peut pas prendre
plus d’allumettes qu’il n’en reste en jeu. 


Le non respect de ces règles sera signalé par une exception, contrôlée par le compilateur, appelée CoupInvalideException.


La classe Joueur modélise un joueur. Un joueur a un nom. On peut demander à un joueur
le nombre d’allumettes qu’il veut prendre pour un jeu donné (getPrise). Un joueur détermine
le nombre d’allumettes à prendre en fonction de sa stratégie : naïf, rapide, expert ou humain. Il
pourrait y avoir d’autres stratégies.


La classe Arbitre fait respecter les règles du jeu aux deux joueurs. Cette classe possède un
constructeur qui prend en paramètre les deux joueurs j1 et j2 qui vont s’affronter. Une partie
peut alors être arbitrée entre ces deux joueurs. L’arbitre fait jouer, à tour de rôle, chaque joueur
en commençant par le joueur j1. Celui qui prend la dernière allumette a perdu. Faire jouer un
joueur consiste à lui demander le nombre d’allumettes qu’il souhaite prendre, puis à les retirer
du jeu. Si ceci provoque une violation des règles du jeu (exception CoupInvalideException), le
même joueur devra rejouer.


![diagramme_classe_13_allumettes](https://user-images.githubusercontent.com/38117821/137368470-fc3f12b3-7000-4954-8b96-96d098f873be.PNG)

