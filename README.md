# Midterm_Sadaf_Darwish

Java application for calculating salary/commission with inheritance and validation.

## Project structure
- `src/midterm/Applicant.java` (abstract base)
- `src/midterm/HourlyApplicant.java` (extends Applicant; overrides `earnings()` with overtime)
- `src/midterm/CommissionApplication.java` (extends Applicant; overrides `earnings()`)
- `src/midterm/Driver.java` (creates 3 + 3 objects and prints results)

## Run (Eclipse)
1. **File → New → Java Project** → Name: `Midterm_Sadaf_Darwish`.
2. Create package `midterm` under `src`.
3. Add the four `.java` files above.
4. Right‑click `Driver.java` → **Run As → Java Application**.

## Run (Command line)
```bash
cd src
javac midterm/*.java
java midterm.Driver
```

## GitHub upload (step‑by‑step)
1. Create a new repo on GitHub named `Midterm_Sadaf_Darwish` (Public).
2. In Eclipse: **View → Terminal** (or open PowerShell in the project folder).
3. Initialize and push:
```bash
git init
git add .
git commit -m "Midterm: salary & commission app"
git branch -M main
git remote add origin https://github.com/<your-username>/Midterm_Sadaf_Darwish.git
git push -u origin main
```
4. Share the resulting link (e.g., `https://github.com/<your-username>/Midterm_Sadaf_Darwish`).

## Video checklist (what to show)
- Your **name + Student ID card** at the start.
- Show the project structure in Eclipse.
- Open each class and briefly explain:
  - Fields + validation (non‑empty names/SIN, wage > 0, 0 ≤ hours ≤ 168, grossSales ≥ 0, 0 ≤ commissionRate ≤ 1).
  - Why `Applicant` is abstract and `earnings()` is overridden.
- Run `Driver` and show the console output for all 6 objects.
- End by showing your GitHub repo URL in the browser.


## 4‑Minute Video Script (show code → then run)

**0:00 – 0:10** – Show your **Student ID card** and say:
> "My name is Sadaf Darwish, Student ID 301493791. This is my Part B Midterm."

**0:10 – 0:50** – Show `Applicant.java`:
- Abstract class with `firstName`, `lastName`, `socialInsuranceNumber`.
- Non-empty validation in setters; `earnings()` is **abstract**.

**0:50 – 1:40** – Show `HourlyApplicant.java`:
- Fields: `wage`, `hours`; validation (wage>0, 0≤hours≤168).
- Overridden `earnings()` with 1.5x overtime after 40 hours.
- Show `toString()`.

**1:40 – 2:20** – Show `CommissionApplication.java`:
- Fields: `grossSales`, `commissionRate` with validation (sales≥0, 0≤rate≤1).
- Overridden `earnings()` = sales × rate.
- Show `toString()`.

**2:20 – 3:10** – Show `Driver.java`:
- Create **3 Hourly** + **3 Commission** objects.
- Print each object. Mention validation demo comment.

**3:10 – 3:45** – **Run the application** (Run As → Java Application):
- Scroll console so all six results are visible.

**3:45 – 4:00** – Show your **GitHub repo URL** in the browser.
