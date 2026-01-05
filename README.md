<div align="center">

# 📘 **Devoir Java**
## 🧵 *Strings • Arrays • OOP*

👤 **Auteur : Mustapha Elmifdali**  
🎓 **Filière : SDIA – M1**  
💻 **Langage : Java**

</div>

---

## 🧩 **Sommaire**
- 📊 Exercice 1 : Gestion des notes
- ✍️ Exercice 2 : Conjugaison
- 🔁 Exercice 3 : Chaînes de caractères
- 🔤 Exercice 4 : Comptage des lettres

---

## 📊 **Exercice 1 — Gestion des notes des étudiants**

> 🎯 **Objectif**  
Gérer les notes des étudiants à l’aide d’un tableau et effectuer plusieurs traitements.

### 🛠️ Fonctionnalités
| ✔ | Opération |
|---|----------|
| 🔢 | Stockage des notes |
| 📈 | Tri des notes |
| 📊 | Calcul de la moyenne |
| 🏆 | Note max & min |
| 🔍 | Comptage d’une note donnée |

### ⚙️ Solution technique
- Tableau : `int[] grades`
- Tri : `Arrays.sort()`
- Boucles pour calculs statistiques

### ▶️ Exécution
<p align="center">
  <img src="execpics/exec1.png" width="600">
</p>

---

## ✍️ **Exercice 2 — Conjugaison d’un verbe du 1er groupe**

> 🎯 **Objectif**  
Conjuguer un verbe régulier en **-er** au présent de l’indicatif.

### 🛠️ Étapes
- Vérification de la terminaison `-er`
- Extraction du radical
- Ajout des terminaisons :
  - `e`, `es`, `e`, `ons`, `ez`, `ent`

### ▶️ Exécution
<p align="center">
  <img src="execpics/exec2.png" width="600">
</p>

---

## 🔁 **Exercice 3 — Opérations sur une chaîne de caractères**

> 🎯 **Objectif**  
Créer un menu interactif pour manipuler une chaîne de caractères.

### 🧩 Menu proposé
| Option | Action |
|------|--------|
| 1️⃣ | Entrer une chaîne |
| 2️⃣ | Afficher la chaîne |
| 3️⃣ | Inverser la chaîne |
| 4️⃣ | Compter les mots |

### ⚙️ Solution technique
- `Scanner` pour la saisie
- `StringBuilder.reverse()`
- `split("\\s+")` pour les mots

### ▶️ Exécution
<p align="center">
  <img src="execpics/exec31.png" width="600"><br>
  <img src="execpics/exec32.png" width="600">
</p>

---

## 🔤 **Exercice 4 — Comptage des lettres**

> 🎯 **Objectif**  
Compter les occurrences de chaque lettre **sans tenir compte de la casse**.

### ⚙️ Solution technique
- Tableau : `int[26]`
- Conversion en majuscules
- Parcours caractère par caractère

### ▶️ Exécution
<p align="center">
  <img src="execpics/exec4.png" width="600">
</p>

---

<div align="center">

### ✅ **Fin du devoir**
Merci pour la lecture 🙌  
⭐ N’hésitez pas à laisser une étoile sur le dépôt GitHub !

</div>
