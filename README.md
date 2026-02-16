# Session-2 Notes

## The Truth About Comments

**The Paradox:**
- "Today's languages are too rich" - we have better tools than comments
- "Nothing can be quite so helpful as a good comment"
- Yet: "Every comment is a failure, not a great achievement"

**The Problem:**
- "Comments can be lies because nobody refactors them" - they rot
- Code changes, comments stay static
- Comments become misleading over time

---

## The Comment Hierarchy

### First: Try Everything Else
**Rule:** Don't comment first - commenting is a last resort

**The Better Approach:**
If ideas aren't clearly explained in code, try refactoring before commenting

**Example - Employee Promotion Check:**
```java
// Bad: requires comment to understand
if((employee.flags || HOURLY_FLAG>35) && employee.age>65) {...}

// Good: self-documenting code
if(employee.isEligibleForPromotion()) {...}
```

---

## Acceptable Comments

**1. Copyright Notices**
- Legal requirement (mostly in USA)

**2. Informative Comments**
- Format specifications: `// hh:mm:ss`
- Regular expression explanations

**3. Explanation of Intent**
- Race condition explanations
- Non-obvious assertions:
```java
assert a == a;  // simple equality
assert a > b;   // comparison
assert ...;     // complex - hard to see intent
```

**4. Warning of Consequences**
```java
// WARNING: This code writes 10,000 lines to file
```

**5. Amplifications**
```java
match().group(3).trim();  // DON'T remove trim - required for parsing
```

---

## JavaDocs

**Purpose:** Generating library documentation for external users
- Produces UI documentation
- Use for public APIs only

---

## Naming Conventions

### Avoid Meaningless Names

**Bad:**
```java
int d;  // elapsed time in days
```

**Good:**
```java
int elapsedTimeInDays;
```

### Scope-Based Length Rules

**Small Scopes → Short Names:**
- Inside `if()`, `for()`, `while()` blocks
- Local variables can be brief

**Large Scopes → Long Names:**
- Class-level static variables: can be very long
- Instance variables: can be longish
- **Note:** For functions it's the opposite (small functions = longer names)

---



## Anti-Patterns

### Avoid Number Series
- Don't use: `var1`, `var2`, `var3`
- Don't use: `data1`, `data2`, `data3`
- Use meaningful, descriptive names instead

---

## Key Principles

- Code should explain itself
- Comments are admission of failure to express in code
- Refactor first, comment last
- Good names eliminate need for comments