{{ products 
   |> groupBy => it.Category
   |> map => { Category: it.Key, MostExpensivePrice: it.max(p => p.UnitPrice) }
   |> htmlDump }}