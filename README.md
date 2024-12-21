
## Gestion des Exceptions en Java

Ce projet illustre la gestion des exceptions en Java à travers un TP universitaire.  
L'objectif principal est de comprendre comment créer et utiliser des exceptions personnalisées.

### Points Importants sur les Exceptions en Java

1. **Qu'est-ce qu'une exception ?**  
   Une exception est un événement inattendu interrompant le flux normal du programme. En Java :
    - Les **exceptions surveillées** (checked) sont vérifiées à la compilation (ex. : IOException).
    - Les **exceptions non surveillées** (unchecked) surviennent à l'exécution (ex. : ArithmeticException).

2. **Création d'exceptions personnalisées** :
    - Les exceptions personnalisées permettent de mieux gérer les erreurs spécifiques.
    - Héritent de la classe `Exception` et incluent des attributs/méthodes pour stocker des informations utiles.

3. **Blocs try-catch** :  
   Utilisés pour capturer et traiter les exceptions, garantissant une exécution continue du programme.

### TP : Gestion des Exceptions (Exercice Universitaire)

Nous avons créé une classe `EntierNaturel` pour gérer des entiers naturels (positifs ou nuls) et une exception personnalisée `NombreNegatifException`.  
Les fonctionnalités incluent :

- **Initialisation d'un entier naturel** : Le constructeur génère une exception si une valeur négative est passée.
- **Accesseurs** : Méthodes pour lire ou modifier la valeur, avec gestion d'exceptions.
- **Décrémentation** : Une méthode pour décrémenter, levant une exception si le résultat est négatif.

### Résumé du Code

L'exercice inclut une classe principale permettant de tester la gestion des exceptions avec des entrées utilisateur.  
Le programme interrompt l'exécution ou affiche des messages en cas d'erreur, selon les bonnes pratiques.

---

