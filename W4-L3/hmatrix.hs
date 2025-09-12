-- Displays matrix function
displayMatrix :: [[Int]] -> IO ()
displayMatrix = mapM_ (\row -> do
    mapM_ (\val -> putStr ("[" ++ show val ++ "]\t")) row
    putStrLn "")

-- Add matrices function
-- Adding two matrices element-wise (curried explicitly)
addMatrices :: [[Int]] -> [[Int]] -> [[Int]]  -- addMatrices :: [[Int]] -> ( [[Int]] -> [[Int]] )
addMatrices = zipWith (zipWith (+))

main :: IO ()
main = do
    putStrLn "Matrix Addition Calculator\n"
    
    -- Hard coded matrix inputs
    let matrixA = [[1, 2], [3, 4]]
    let matrixB = [[5, 6], [7, 8]]

    putStrLn "Matrix A"
    displayMatrix matrixA

    putStrLn "Matrix B"
    displayMatrix matrixB
    putStrLn ""
  
    -- Currying application
    let addToA = addMatrices matrixA  
    let result = addToA matrixB

    putStrLn "Output matrix"
    displayMatrix result
