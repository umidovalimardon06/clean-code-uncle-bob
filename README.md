# Session — Test Driven Development Notes
> *Notes from Uncle Bob's session on TDD*

---

## The Big Picture

All we have done over 70 years of programming is **sequence, selection, and iteration** — and 100+ languages built on top of that.

For 30 years the industry chased a golden language. It doesn't exist.

Object-oriented programming as we know it emerged around **1966**.

> *"We love people — and we have to be able to say no to people."*

---

## The 3 Rules of TDD

**Rule 1** — You are not allowed to write any production code until you have written a test that fails because the production code doesn't exist.

**Rule 2** — You are not allowed to write more of a test than is sufficient to fail. Not compiling counts as failing — as soon as the test fails to compile, you must stop writing.

**Rule 3** — You are not allowed to write any more production code than is sufficient to pass the current failing test.

### The Cycle in Practice

1. Write a test → no production code exists → it doesn't compile
2. Now you are allowed to write just enough code to make it compile and pass
3. Repeat

---

## Why TDD Matters

> *"Tests are the real documentation of the system."*

> *"Testable code = decoupled code."*

The discipline forces good design. If code is hard to test, it is tightly coupled — and coupling is the root of most architectural problems.

**On inheritance:** leads to tight coupling — use with caution.

---

## Mutation Testing

Tools like **PIT** (Java) modify the source code in tiny ways to verify the test suite actually catches the changes.

The goal in practice: *"I know this source code change is wrong — but it passes the tests. What can I add to prove that wrongness?"*

The production code and test code should be **as far apart in concern as possible** — yet deeply connected in coverage.

> *The frustration is real: "just write the logic." But the practice, brought to work consistently, is very rewarding.*

---

## Testing Levels

| Level | Owned By | Purpose |
|---|---|---|
| Unit tests | Developer | Test individual functions and logic |
| Component / Acceptance tests | QA, business rules | Verify behavior at the feature level |
| Integration tests | Architect / Senior dev | Test communication between systems |

---

## QA Notes

- Braces after `if()`, `while()` etc. are not strictly required for single-line bodies — but consistency matters
- Unit tests sit at the bottom; integration tests sit at the top