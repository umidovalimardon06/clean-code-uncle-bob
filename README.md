# Session 5 — Architecture Notes
> *Notes from Uncle Bob's session on software architecture*

---

## Working vs. Working Right

**Working** — getting software functional and correct: it runs, it produces output.

**Working right** — the hard part. It requires discipline and domain understanding across:

- Architecture
- Requirements
- Abstractions
- Performance characteristics
- Security model
- Domain model
- Operational behavior (maintainability, observability)

### When you get it right:
- The codebase becomes composable, predictable, and easy to extend
- Features feel cheap

---

## The Main Goal of Architecture

> "Minimize the human resources required to build and maintain software systems."

A good design is one where effort stays **constant** — or even **shrinks** — over time.

---

## The Startup Culture Trap

The US/West startup mentality: *"Make a mess as fast as you can in hopes of hitting exponential growth."*

The assumption: *"We can stay productive while being messy. We can clean it up later."*

This is wrong.

> "Slow and steady wins the race."
> "The secret to going fast is not to build the roadblocks that will make you slow."

**Study and practice must be long-term.**

*Jason Gorman's experiment: wrote the same program 6 times over 6 separate days.*

---

## The Productivity Paradox

The decline in productivity can only be reversed by accepting one truth:

> **"The only way to get fast is to go well."**

A solution to the executive dilemma: sit down with stakeholders and explain the productivity paradox in clear, understandable terms.

---

## The Two Values of Software

1. **What it does** — behavior, features
2. **Its structure** — how it is built

> "If the software isn't changeable, it becomes worthless tomorrow."

---

## Stakeholders and Architecture

Stakeholders always want changes — but they never prioritize architecture.

> "I have two kinds of problems: the urgent and the important. The important are never urgent."

The **responsibility** of architects and developers is to communicate with stakeholders in an understandable manner — this is a people skill, like that of a salesperson or manager.

---

## On the Web and Databases

- *"The web is a delivery mechanism."*
- *"The web is an I/O device."*
- *"The database is a detail — isolate it."*

Oracle's strategy frames data as a **"data asset"** — a great term for CEOs — but the underlying principle remains: don't let the database drive your architecture.