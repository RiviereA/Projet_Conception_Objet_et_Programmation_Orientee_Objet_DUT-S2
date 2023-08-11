# Projet de Conception Objet et de Programmation Orientée Objet (DUT S2)

On considère un aquarium d'eau douce froide reproduisant au mieux le biotope du lac SaintLaurent. Les dimensions sont suffisamment grandes pour que les poissons puissent évoluer et se reproduire de manière naturelle et sans stress. Dans cet environnement fermé cohabitent des tigres d'eau-douce (**maskinongé**) et des grands **brochets**, deux espèces différentes sexuées. Parfois de cette union peut naître un hybride appelé **brochet tigré**, comme tous les hybrides, ce poisson ne peut pas se reproduire. 

Tous ces spécimens sont des **chasseurs**, réputés pour ignorer les appâts **morts**, tuant des poissons vivants à proximité. Toute nourriture carnée est à leur menu : écrevisses, planorbes, caneton,…

Les **écrevisses** se nourrissent de matière organique prélevée dans le sédiment. La matière organique s'enrichit des déjections des habitants, des dépouilles, des restes des algues,…

Pour agrémenter le bassin, des **algues** fournissent une base au régime alimentaire des **otocinclus affinis**. Ces poissons herbivores apprécient également les **planorbes**, escargots détritivores et mangeurs de cadavres. Comme tous les escargots, les planorbes sont **hermaphrodites**.

## Gestion de la vie et de la mort

Chaque être vivant possède une certaine **longévité** maximale, et donc peut **mourir** de vieillesse. Il peut également être tué et/ou mangé. Un être vivant mourant se transforme en **cadavre** et tombe au fond du lac où il peut nourrir les **charognards**, ou se décomposer en **sédiments**. Si le lac comporte trop de sédiments, il devient **invivable** et la simulation se **termine**. Quand il n’y a plus d’êtres vivants dans le lac, la simulation se **termine**.

## Gestion de la nourriture

Le simple fait de vivre "consomme" de **l’énergie vitale**. En dessous d’un certain seuil, les déplacements deviennent **impossibles**, puis l’animal **meurt**. Il faut donc que l’animal se nourrisse. Pour cela, il fera confiance... au **hasard** : s’il rencontre un être **comestible** pour lui (détecté par une collision), alors il le **mange** : l’autre être disparaît du monde et le prédateur augmente son énergie vitale. Bien modéliser le fait qu’un être ne peut pas manger n’importe quoi. L’énergie vitale ne peut jamais dépasser 100% du maximum.

## Gestion de la reproduction

* Pour les êtres **sexués**, la reproduction nécessite la rencontre d’un mâle et d’une femelle de la **même espèce** ou pouvant donner un **hybride**. Les deux doivent être matures, et la femelle ne doit pas déjà porter un enfant, elle doit être dans sa période de **reproduction** (régulière). Le temps de **gestation** dépend de l’espèce. Un **hermaphrodite** est à la fois mâle et femelle, mais à tout de même besoin d’un autre représentant de son espèce. Donner naissance à un enfant **consomme** de l’énergie vitale (10% du maximum), ce qui peut entraîner la **mort** de la mère.
* Pour les êtres **asexués**, la reproduction est faite automatiquement en **milieu de vie**, si l’énergie vitale est **suffisante** (au moins 30% du maximum), par "clonage". Ce clonage consomme 30% du maximum de l’énergie vitale, et peut donc entrainer la **mort** de l’être.