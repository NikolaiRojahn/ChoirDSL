package choir.printers

import choir.dsl.*

interface Visitor {
  fun visit(choir: Choir)
  }