# medicaid-backend
Medicaid eligibility tool

The federal poverty level is used to determine eligibility for Medicaid and CHIP (the Children’s Health Insurance Program). Some states have adopted ACA's Medicaid 
expansion while others have not. This web tool seeks to give a quick estimate of a user's Medicaid and CHIP eligibility based on their income and the following criteria:

* In states that have expanded Medicaid, Americans under the age of 65 will qualify for Medicaid if they earn up to 138% of the federal poverty level. (Note that although you’ll often see this written as 133%; there’s a 5% income disregard that effectively brings it up to 138%.)
* In states that haven’t expanded Medicaid, the eligibility guidelines are stricter, with much lower income limits for parents and coverage generally not available at all to non-disabled childless adults, regardless of how low their income is. This creates a coverage gap that exists in 11 states as of 2022.

Web app tool will seek to provide accurate eligibility checks on a per state basis. Expansion of ACA in 50 states from the start of 2022:
[![current-50-states.png](https://i.postimg.cc/NjtWKrnY/current-50-states.png)](https://postimg.cc/D8CCDmFY)

Backend System Design:
[![arch.png](https://i.postimg.cc/85YFZGvk/arch.png)](https://postimg.cc/cgQ4JVTP)

