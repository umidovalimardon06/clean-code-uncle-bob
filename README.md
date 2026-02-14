# Session-1 Notes

## The Big Picture

"Current society is dependent on software" - other people think they rule the world but they handed it to us. We rule.

**The Regulatory Path:**
- Legislation (regulations) → civil servants (devs become)
- To avoid these we need to establish "Ethics"
- "Invented rules into laws" - this is what happened to doctors, lawyers, architects... (regulation)

**Fragile Premise:**
If we broke that everything fails

---

## Speed vs. Quality

**The Paradox:**
- Programmers are slow because they make mess
- If they avoid the mess they will be fast
- Desire to be fast → make a mess
- **To go fast, do well**

**Code Quality:**
- Clean code: WTF
- Messy code: WTF, WTF, WTF

---

## Function Design Principles

### Abstraction Levels
Example:
- `WikiPage` (highest-level of abstraction)
- `StringBuilder` (lowest-level of abstraction)

**Rule:** Every line in a function should be on a same level of abstraction

### Core Rules
- **Exit-early** pattern
- Functions should be small
- Functions should do one thing
- Extract methods from function by proper naming

### Arguments
- No more than 3 arguments for functions
- Never (mostly) pass boolean to the function

### Code Philosophy
- Least surprising code
- Avoid switch statements (dependency magnets)

---

## Design Patterns

### Open-Closed Principle: Polymorphism
Shape example:
```
    S
    c  --> dep
    c  --> dep
    c  --> dep
```

### Advanced Patterns
- Lambdas and command patterns as arguments
- Try-block should contain only one line

---

## Java Origin Story

**Timeline:** 1992-1993
- James Gosling
- Contract-programming division
- Created Java (Oak) for coding television box without C++

**Sun's Strategy:**
- Sun was hardware company, sold pieces of metal
- Best way to sell hardware is winning the heart and minds of programmers
- Programmers do the buying decisions
- Then they used Java (by renaming it)

---

## Key Terms

- **Green-field:** starting from scratch, no legacy dependency
- **Fragile-premise:** if we broke that everything fails
- **Dependency magnets:** switch statements that create coupling